package universal_LLnNode;

import java.util.Scanner;
import java.util.Stack;

public class StackArithmethic {
    public static void main(String[] args) {
        Scanner txtScn = new Scanner(System.in);

        Stack<String> value = new Stack<String>();
        String input = null;

        do {
            System.out.print("Push >> ");
            input = txtScn.nextLine();

            if (isNumeric(input)) {
                value.push(input);
            } else if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")
                    || input.equals("$")) {
                int number2 = Integer.parseInt(value.pop());
                int number1 = Integer.parseInt(value.pop());

                // System.out.println(number1 + " " + number2);
                value.push(calc(number1, number2, input));
                // System.out.println(calc(number1, number2, input));
            } else {
                System.out.println("-- Invalid Input --");
            }

            System.out.println("Value inside stack: " + value.toString());
        } while (!input.equals("-1"));
        txtScn.close();

        System.out.println("Answer is " + value.pop());
        System.out.println("-- Program Ended Succesfully --");

    }

    public static boolean isNumeric(String number) {
        if (number == null) {
            return false;
        }

        try {
            int i = Integer.parseInt(number);

            if (i == -1) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String calc(int x, int y, String operand) {
        String ansString = null;
        int ans = 0;

        if (operand.equals("+")) {
            ans = x + y;
        } else if (operand.equals("-")) {
            ans = x - y;
        } else if (operand.equals("*")) {
            ans = x * y;
        } else if (operand.equals("/")) {
            ans = x / y;
        } else {
            ans = (int) Math.pow(x, y);
        }
        ansString = ans + "";
        return ansString;
    }
}