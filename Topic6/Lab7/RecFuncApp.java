import java.util.Scanner;

public class RecFuncApp {
    public static void main(String[] args) {
        Scanner numScn = new Scanner(System.in);

        /*
         * int x = numScn.nextInt();
         * int y = numScn.nextInt();
         * numScn.close();
         */

        // int ans = f(x, y);
        System.out.println(f(5, 0));

        // System.out.println(ans);
    }

    public static int f(int x, int y) {
        if (x == y)
            return 1;
        else if (x > y && y >= 1) {
            return f(x - 2, y - 1) + f(x, y - 2);
        }
        return x + y;
    }
}