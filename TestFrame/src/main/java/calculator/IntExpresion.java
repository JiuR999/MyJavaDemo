package calculator;

import java.util.Objects;

public class IntExpresion extends Expression<Integer> {
    public IntExpresion(int left_num, int right_num, char ope) {
        super(left_num, right_num, ope);
        checkOprator(left_num, right_num, ope);
    }

    private void checkOprator(int left_num, int right_num, char ope) {
        if(ope == '+'){
            setResult(left_num + right_num);
        } else if (ope == '-') {
            setResult(left_num - right_num);
        } else if (ope == '*') {
            setResult(left_num - right_num);
        }else{
            setResult(left_num / right_num);
        }
    }
    public void setResult(Integer resul) {

    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeftNum()+ getRightNum(), getLeftNum()+ getRightNum()
        ,getOperator());
    }
}
