package test;

public class Minus extends BinaryStringExpression {

    public Minus(StringExpression left, StringExpression right) {
        super(left, right);
    }

    @Override
    public String calculate() {

        String toRemove = right.calculate();
        String result = left.calculate();
        result = result.replaceAll(toRemove, "");
        return result;
    }
}
