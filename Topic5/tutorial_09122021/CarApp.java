import java.util.Scanner;
import java.util.Stack;

public class CarApp {
    public static void main(String[] args) {
        Scanner inText = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        Stack<Car> carS = new Stack<Car>();
        Stack<Car> tempS = new Stack<Car>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Model >> ");
            String mo = inText.nextLine();
            System.out.print("Manufacturer >> ");
            String ma = inText.nextLine();
            System.out.print("Year Manufactured >> ");
            int year = inNum.nextInt();
            System.out.print("Price >> RM ");
            double price = inNum.nextDouble();

            carS.push(new Car(mo, ma, year, price));
        }
        inNum.close();
        inText.close();

        while (!carS.isEmpty()) {
            Car temp = carS.pop();

            if (temp.getManufacturer().equalsIgnoreCase("Toyota")) {
                System.out.println(temp.toString());
            }

            tempS.push(temp);
        }

        int y2020 = 0;
        while (!tempS.isEmpty()) {
            Car temp = tempS.pop();

            if (temp.getYear() == 2020) {
                y2020++;
            }

            carS.push(temp);
        }
        System.out.println("Total car produced in 2020 is " + y2020);
    }
}