import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> sList = new ArrayList<Integer>();

        aList.addAll(Arrays.asList(12, 78, 1, 7, 90));
        aList.set(2, 100);
        System.out.println("aList = " + aList.toString());

        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i) % 3 == 0) {
                sList.add(aList.get(i));
            }
        }
        aList.removeAll(sList);

        System.out.println("\naList = " + aList.toString());
        System.out.println("sList = " + sList.toString());
    }
}