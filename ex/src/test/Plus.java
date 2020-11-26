package test;

public class Plus extends BinaryStringExpression {


    public Plus(StringExpression left, StringExpression right) {
        super(left, right);
    }

    @Override
    public String calculate() {
        return this.left.calculate() + this.right.calculate();
    }

}
