/**
 * LinkedListApp
 */
//import java.util.LinkedList;
import java.util.Scanner;
import topic3.universal_LLnNode.LinkedList;

public class LinkedListApp {
    public static void main(String[] args){
        Scanner inNum = new Scanner(System.in);

        // Declare an Integer LinkedList named intList
        LinkedList<Integer> intList = new LinkedList<Integer>();

        // Insert 5 integer value into the LinkedList
        System.out.println("Enter 5 Number:-");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". ");
            intList.addLast(inNum.nextInt());
        }
        inNum.close();

        // Insert Number 10 at the Front
        intList.addFirst(10);

        // Insert number 3 at the back
        intList.addLast(3);

        // Remove the first elements
        intList.removeFirst();

        // Display the content of LinkedList, calculate average and sum of even value
        Integer value = intList.getFirst();
        System.out.println("Value in Linked List: ");
        double avg, total = 0;
        int i = 0, sum = 0;
        while(value != null) {
            System.out.print(value + " ");
            total += value;

            if(value % 2 == 0)
                sum += value;

            value = intList.getNext(); i++;
        }
        avg = total / i;
        System.out.println("\nAverage Value: " + avg);
        System.out.println("Sum Value: " + sum);

    }
}