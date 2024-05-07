package calculator;
public class CalTest {
    public static void main(String[] args) {
        CalculatorHelper calculatorHelper = new CalculatorHelper(50,100, CalculatorHelper.Model.AddSub);
        calculatorHelper.generateExpression();
//        calculatorHelper.generateSpecial(1);
        //calculatorHelper.DispExp();
        Expression<Number> expression = new Expression(50,20,'+');

        expression.printExpresion(1);
        expression.setResult(5.0);
        System.out.println(expression.getResult().toString());
        Expression<Double> expression1 = new Expression<Double>(50.0,20.0,'+');
        expression1.printExpresion(1);


    }
}
