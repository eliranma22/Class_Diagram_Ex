package test;

public abstract class BinaryStringExpression implements StringExpression{

    StringExpression left;
    StringExpression right;

    public BinaryStringExpression(StringExpression left, StringExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public abstract String calculate();

}
