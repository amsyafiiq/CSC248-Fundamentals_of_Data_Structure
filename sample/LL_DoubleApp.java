import java.util.*;
public class LL_DoubleApp
{
    public static void main(String args[])
    {   //LinkedList declaration
        LinkedList <Double> doubleLL=new LinkedList<Double>();
        
        Scanner input=new Scanner(System.in);
        double num;
        
        //input 4 value using addLast
        for(int i=0;i<4;i++)
        {   System.out.println("Enter a number:");
            num=input.nextDouble();
            doubleLL.addLast(num);
        }
        
        //insert the given value at the front of LL
        doubleLL.addFirst(10.5);
        //insert the given value at the back of LL
        doubleLL.addLast(9.25); 
        
        //display the content of LinkedList
        System.out.println("Content in the LinkedList:");
        Double value=doubleLL.getFirst(); //get the first value of LinkedList
        while (value!=null)//to check the existence of data
        {   System.out.print(value+" ");
            value=doubleLL.getNext();  //to retrieve the next data
        }    
        
        //display th sum value of the content in the LinkedList
        double sum=0; //initialize the sum to 0
        value=doubleLL.getFirst();  //access the first value of LinkedList
        while(value!=null)  //to check the existence of data
        {   sum=sum+value;      //to accumulate the sum value
            value=doubleLL.getNext(); //to retrieve the next value in LL
        }
        System.out.println("\nSum value is "+sum); //to display the sum value
        
        //remove the element
        doubleLL.removeLast();
        doubleLL.removeAfter(3.5);
        
        //count and display the number of content in the LinkedList
        int count=0;
        Double data=doubleLL.getFirst(); //get the first value of LinkedList
        while (data!=null)//to check the existence of data
        {   count++;
            data=doubleLL.getNext();  //to retrieve the next data
        }
        System.out.println("\nThe number of content in the LL:"+count);
        

        input.close();
    }   
}
