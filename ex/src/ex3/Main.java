package ex3;

import java.util.Stack;

public class Main {

    public static boolean isOperator(String token) {

        return token.intern() == "MAX" || token.intern() == "ZIP" || token.intern() == "-" || token.intern() == "+";
    }

    public static String calculate(String postfix) throws Exception {

        Stack<String> stack = new Stack<>();

        String[] tokens = postfix.split(" ");

        for (String token : tokens) {

            if (!isOperator(token)) {
                stack.push(token);
                continue;
            }

            if (stack.size() < 2)
                throw new Exception("Not valid postfix expression");

            stack.push("(" + stack.pop() + " " + token + " " + stack.pop() + ")");

        }

        return stack.pop();
    }

    public static void main(String[] args) {

        try {
            System.out.println(calculate("E D MAX C - A +"));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
