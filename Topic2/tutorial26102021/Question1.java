import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);

        ArrayList<Integer> markList = new ArrayList<Integer>();
        
        System.out.println("Enter four number:-");
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + " >> ");
            markList.add(inNum.nextInt());
        }
        inNum.close();

        System.out.println(markList.get(1));
        markList.set(markList.size() - 1, 100);
        markList.remove(0);
    }
}