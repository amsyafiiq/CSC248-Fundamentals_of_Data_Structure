import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Excersice1 {
    public static void main(String[] args) {
        // Input Object Declaration
        Scanner inNum = new Scanner(System.in);

        // numArr ArrayList Declarations
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        numArr.addAll(Arrays.asList(16, 1, 77, 5, 2, 77)); // Add initial value to the ArrayList

        // User Input for ArrayList
        System.out.println("Input three more values:- ");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " - ");
            numArr.add(inNum.nextInt());
        }
        inNum.close();

        // Size of numArr ArrayList
        System.out.println("\nThe size of the array is " + numArr.size());

        // Find and display the highest value in numArr and calculate the total value of the ArrayList
        int highest = 0, sum = 0;
        for (int i = 0; i < numArr.size(); i++) {
            if (numArr.get(i) > highest) {
                highest = numArr.get(i);
            }
            sum += numArr.get(i);
        }
        System.out.println("\nnumArr : " + numArr.toString());
        System.out.println("The highest value is " + highest);
        System.out.println("The sum of the values is " + sum);
        
        // Remove the content of index 2 in ArrayList
        numArr.remove(2);

        // evenArr ArrayList declaration
        ArrayList<Integer> evenArr = new ArrayList<Integer>();

        // FInd even number in numArr and save it into evenArr
        for (int i = 0; i < numArr.size(); i++) {
            if (numArr.get(i) % 2 == 0) {
                evenArr.add(numArr.get(i));
            }
        }
        numArr.removeAll(evenArr); // Remove all even number from numArr

        // Print the value in numArr and  evenArr
        System.out.println("\nnumArr : " + numArr.toString());
        System.out.println("evenArr : " + evenArr.toString());

        // Sorting the value inside evenArr using insertion sort method
        for (int i = 1; i < evenArr.size(); i++) {
            int key = evenArr.get(i);
            int j = i - 1;
            while (j >= 0 && evenArr.get(j) > key) {
                evenArr.set(j + 1, evenArr.get(j));
                j = j - 1;
            }
            evenArr.set(j + 1, key);
        }

        // Display the value of evenArr after sorting
        System.out.println("\nSorted Value of evenArr : " + evenArr.toString());
    }
}