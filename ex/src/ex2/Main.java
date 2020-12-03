package ex2;


import test.*;

public class Main {

    public static void main(String[] args) {
        StringExpression zip;
        // ZIP right
        StringExpression max = new Max(new MyString("Cnrtltos"),
                new MyString("Algo"));
        // Zip(, "Cnrtltos")
        // ZIP left
        StringExpression minus = new Minus(
                new MyString("ogauxwxaxwxin"),
                new Plus(new MyString("x"), new MyString("wx")));
        zip = new ZIP(max, minus);
        System.out.println(zip.calculate());



    }
}
