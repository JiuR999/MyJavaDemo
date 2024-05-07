package calculator;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    Stack<Integer> stack = new Stack<>();
    // 操作符的优先级映射
    private static int getPriority(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> -1;
        };
    }

    // 将中缀表达式转换为后缀表达式
    public String convertToPostfix(String infixExpression) {
        StringBuilder builder = new StringBuilder();
        StringBuilder postFixBuilder = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        for (int i = 0; i < infixExpression.length(); i++) {
            char currentChar = infixExpression.charAt(i);
            // 如果是操作数，直接添加到后缀表达式中
            if (Character.isLetterOrDigit(currentChar)) {
                builder.append(currentChar);
                while ((i+1)<infixExpression.length()&&Character.isLetterOrDigit(infixExpression
                        .charAt(i+1))){
                    i++;
                    builder.append(infixExpression
                            .charAt(i));
                }
                this.stack.push(Integer.parseInt(builder.toString()));

                postFixBuilder.append(builder.toString());
                builder.setLength(0);

            }
            // 如果是左括号，入栈
            else if (currentChar == '(') {
                operatorStack.push(currentChar);
            }
            // 如果是右括号，将栈顶的操作符弹出并添加到后缀表达式中，直到遇到左括号
            else if (currentChar == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postFixBuilder.append(operatorStack.pop());
                }
                // 弹出左括号
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                }
            }
            // 如果是操作符
            else {
                while (!operatorStack.isEmpty() && getPriority(currentChar) <= getPriority(operatorStack.peek())) {
                    postFixBuilder.append(operatorStack.pop());
                }
                operatorStack.push(currentChar);
            }
        }

        // 将剩余的操作符弹出并添加到后缀表达式中
        while (!operatorStack.isEmpty()) {
            if (operatorStack.peek() == '(' || operatorStack.peek() == ')') {
                throw new IllegalArgumentException("Invalid infix expression");
            }
            postFixBuilder.append(operatorStack.pop());
        }

        return postFixBuilder.toString();
    }

    // 判断是否是操作符
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // 执行操作符的计算
    private static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    // 计算后缀表达式的值
    public static int evaluatePostfix(String postfixExpression) {
        Stack<Integer> operandStack = new Stack<>();

        for (int i = 0; i < postfixExpression.length(); i++) {
            char currentChar = postfixExpression.charAt(i);
            // 如果是操作数，入栈
            if (Character.isDigit(currentChar)) {
                int operand = Character.getNumericValue(currentChar);
                operandStack.push(operand);
            }
            // 如果是操作符，从栈中弹出两个操作数进行计算，并将结果入栈
            else if (isOperator(currentChar)) {
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                int result = performOperation(operand1, operand2, currentChar);
                operandStack.push(result);
            }
        }
        // 返回最终结果
        return operandStack.pop();
    }

    public static void main(String[] args) {
           String inFix = new Scanner(System.in).next();
           String postFix = new InfixToPostfix().convertToPostfix(inFix);
        System.out.println("后缀:"+postFix);
        System.out.println("答案"+evaluatePostfix(postFix));
    }
}
