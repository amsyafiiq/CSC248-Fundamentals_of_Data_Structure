package Question1;

public class Question1 {
    
    public static void main(String[] args) {
        //1. Initialize the given value into an array named arrayNump[]: 40.2, 5.8, 8.92, 10.56, 3.15, 7.99
        double arrayNum[] = {40.2, 5.8, 8.92, 10.56, 3.15, 7.99};
        
        //2. Display the average value
        double total = 0;
        
        for (int i = 0; i <  arrayNum.length; i++) {
            total += arrayNum[i];
        }
        double avg = total / arrayNum.length;
        System.out.println("The average of the numbers is " + avg);
        System.out.println();
        
        //3. Display the highest value
        double highest = 0;
        
        for (int i = 0; i <  arrayNum.length; i++) {
            if (arrayNum[i] > highest){
                highest = arrayNum[i];
            }
        }
        System.out.println("The highest number in the array is " + highest);
        System.out.println();
        
        //4. Display the data in the array
        System.out.println("The data in the array is :-");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i]);
            
            if (i < arrayNum.length - 1) {
                System.out.print(", ");
            }
        }
    }
    
}