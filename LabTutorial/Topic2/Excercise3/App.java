package Topic2.Excercise3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * App
 */
public class App {
    public static void main(String[] args){
        Scanner inNum = new Scanner(System.in);
        ArrayList<Float> floatList = new ArrayList<Float>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Insert Number >> ");
            floatList.add(0, inNum.nextFloat());
        }
        inNum.close();
        System.out.println(floatList.toString());
        floatList.add(2, (float) 7.5);

        System.out.println(floatList.toString());
        floatList.remove(1);
        System.out.println(floatList.toString());

        float total = (float) 0.0;
        for (float value : floatList){
            total += value;
        }
        System.out.println(total);
    }
}