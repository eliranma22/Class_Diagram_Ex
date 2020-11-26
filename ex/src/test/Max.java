package test;

public class Max extends BinaryStringExpression {

    public Max(StringExpression left, StringExpression right) {
        super(left, right);
    }

    @Override
    public String calculate() {
        String rightValue = this.right.calculate();
        String leftValue = this.left.calculate();
        String result;

        if(leftValue.compareTo(rightValue) > 0)
            return leftValue;

        return rightValue;
    }
}
