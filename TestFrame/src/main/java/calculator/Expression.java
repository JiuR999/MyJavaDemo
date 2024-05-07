package calculator;

import java.util.Objects;

public class Expression<T> {
    private  T leftNum;
    private T rightNum;
    private char operator;
    private String expression;
    private T result;
    public Expression(T leftNum, T rightNum, char ope) {
        this.leftNum = leftNum;
        this.rightNum = rightNum;
        this.operator = ope;
    }
    public void setExpression(){
        this.expression = String.valueOf(leftNum)+operator+String.valueOf(rightNum)+"="+String.valueOf(result);
    }
    public void setResult(T resul){
        this.result = resul;
    }
    public void printExpresion(int order){
        setExpression();
        String sb = order + "、 " + this.leftNum +
                this.operator + this.rightNum +
                "=" + "\t";
        System.out.println(sb);
        //System.out.printf("%2d、%2d %c %2d = \t",order,this.left_num,this.operator,this.right_num);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        } else if (!(obj instanceof Expression)) {
            return false;
        }
        Expression expresion1 = (Expression) obj;
        if((this.operator == '+'&&expresion1.operator == '+')
                ||(this.operator == '*'&&expresion1.operator == '*')){
            if((this.leftNum == expresion1.leftNum && this.rightNum == expresion1.rightNum)
             || this.leftNum == expresion1.rightNum && this.rightNum == expresion1.leftNum){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int left = Integer.parseInt(String.valueOf(leftNum));
        int right = Integer.parseInt(String.valueOf(rightNum));
        return Objects.hash(left+right,left+right,this.operator);
    }

    public T getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(T leftNum) {
        this.leftNum = leftNum;
    }

    public T getRightNum() {
        return rightNum;
    }

    public void setRightNum(T rightNum) {
        this.rightNum = rightNum;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public T getResult() {
        return result;
    }

}
