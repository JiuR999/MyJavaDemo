package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorHelperTest {
    private CalculatorHelper calculatorHelper = new CalculatorHelper(50,100,4);
    @Test
    void generateExpression() {
         calculatorHelper.generateExpression();
         calculatorHelper.DispExp();
    }

    @Test
    void generateSpecial() {
        calculatorHelper.generateSpecial(1);
    }

}