import java.util.*;
public class LL_StrApp
{
    public static void main(String args[])
    {   //LinkedList declaration
        LinkedList <String> strList=new LinkedList<String>();
        
        Scanner input=new Scanner(System.in);
        
        //ask the user to input a string, the process will stop until user enter "no"
        String answer="yes";
        String word;
        
        while(answer.equalsIgnoreCase("yes"))
        {   System.out.println("Enter a word:");
            word=input.next();
            
            //insert at the back of LinkedList
            strList.addLast(word);
            System.out.println("Do you want to continue(yes/no)?");
            answer=input.next();
        }   
        
        //input 3 value using addFirst
        for(int i=0;i<3;i++)
        {   System.out.println("Enter a word:");
            word=input.next();
            strList.addFirst(word);
        }
        input.close();

        //insert the given value at the front of LL
        strList.addFirst("syukur");
        //insert the given value at the back of LL
        strList.addLast("careful"); 
        
        //display the content of LinkedList
        System.out.println("Content in the LinkedList:");
        String value=strList.getFirst(); //get the first value of LinkedList
        while (value!=null)//to check the existence of data
        {   System.out.print(value+" ");
            value=strList.getNext();  //to retrieve the next data
        }    
        
        //remove the first element
        strList.removeFirst();
        strList.removeAfter("ini");
        
        //count and display the number of content in the LinkedList
        int count=0;
        String data=strList.getFirst(); //get the first value of LinkedList
        while (data!=null)//to check the existence of data
        {   count++;
            data=strList.getNext();  //to retrieve the next data
        }
        System.out.println("\nThe number of content in the LL:"+count);
        
    }   
}
