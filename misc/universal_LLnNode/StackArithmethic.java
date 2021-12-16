package universal_LLnNode;

import java.util.Scanner;
import java.util.Stack;

public class StackArithmethic {
    public static void main(String[] args) {
        Scanner txtScn = new Scanner(System.in);

        Stack<String> value = new Stack<String>();
        String input = null;

        while (input != "-1") {
            System.out.print("Push >> ");
            input = txtScn.nextLine();

            if (isNumeric(input)) {
                value.push(input);
            } else if (input == "+" || input == "-" || input == "*" || input == "/" || input == "$") {
                int number1 = Integer.parseInt(value.pop());
                int number2 = Integer.parseInt(value.pop());

                value.push(calc(number1, number2, input));
            } else if (input == "-1") {
                break;
            } else {
                System.out.println("-- Invalid Input --");
            }
        }
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
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String calc(int x, int y, String operand) {
        String ansString = "-1";
        int ans = 0;

        switch (operand) {
            case "+":
                ans = x + y;
            case "-":
                ans = x - y;
            case "*":
                ans = x * y;
            case "/":
                ans = x / y;
            case "$":
                ans = (int) Math.pow(x, y);
        }
        ansString = ans + "";
        return ansString;
    }
}