import java.util.Scanner;

public class iterationNrecursive {
    public static void main(String[] args) {
        // Scanner txtScn = new Scanner(System.in);
        Scanner numScn = new Scanner(System.in);

        System.out.print("Insert Number >> ");
        int num = numScn.nextInt();
        numScn.close();

        System.out.println("Iteration: " + iterationAdd(num));
        System.out.println("Recursive: " + recursiveAdd(num));
    }

    public static int iterationAdd(int x) {
        int total = 0;
        for (int i = 1; i <= x; i++) {
            System.out.println("x = " + i + ", total = " + (total += i));
        }

        return total;
    }

    public static int recursiveAdd(int x) {
        int total = 0;
        if (x > 1) {
            total = x + recursiveAdd(x - 1);
            System.out.println("x= " + x + ", total = " + total);
            return total;
        }

        return 1;
    }
}