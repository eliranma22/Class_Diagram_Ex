package test;

public class MyString implements StringExpression{

    private String value;

    public MyString(String value){
        this.value = value;
    }

    @Override
    public String calculate() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
