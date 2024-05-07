package calculator;

public class WrongQuestion extends Expression {
    private int wrong_id;

    public WrongQuestion(Object left_num, Object right_num, char ope) {
        super(left_num, right_num, ope);
    }
}
