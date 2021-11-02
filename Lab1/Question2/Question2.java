package Question2;
import java.util.Scanner;


public class Question2 {
    public static void main (String[] args) {
        //Scanner inText = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        
        int intArray[] = new int[10];
        
        // Input and store 10 numbers into integer array name intArray[]
        System.out.println("Insert 10 Numbers:-");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print((i + 1) + " - ");
            intArray[i] = inNum.nextInt();
        }
        System.out.println("-- Data Saved --\n");
        inNum.close();

        // Display the third value of an array
        System.out.println("The third value in the array is " + intArray[2]);
        
        // Display the original value of the array
        System.out.println("Original Value");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        
        // Sort the data into ascending order using bubble sort
        int n = intArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (intArray[j -1] > intArray[j]) {
                    
                    int temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println("New Value after sorted");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        
        // Input the search value from use and display whether the number is found or not found
        System.out.print("Insert search value: ");
        int search = inNum.nextInt();
        
        boolean found = false;
        int low = 0, high = intArray.length - 1, mid = 0;
        
        while (high >= low) {
            mid = (low + high) / 2;
            
            if (search < intArray[mid]) {
                high = mid - 1;
            } else if (search > intArray[mid]) {
                low = mid + 1;
            } else {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("The search value is found in the " + mid + " index of the array");
        } else {
            System.out.println("The search value is not found");
        }
    }
}

























