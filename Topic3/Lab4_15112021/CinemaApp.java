/*
Cinema Application
*/
import java.util.*;
import topic3.lab4_E1.Cinema;
import topic3.lab4_E1.LinkedList;

public class CinemaApp {
    public static void main(String[] args) {

        Scanner inputNum =  new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        LinkedList CinemaLL = new LinkedList();
        for (int i=0; i<1; i++) {
            System.out.println("Enter cinema code, i.e. Ha111, Ha112:"); 
            String cc = inputText.nextLine();
            System.out.println("Enter movie title:");
            String mTitle = inputText.nextLine();
            System.out.println("Enter price:");
            double p = inputNum.nextDouble();
            System.out.println("Enter mode payment(cash or credit card):");
            String mp = inputText.nextLine();
            System.out.println("Member or not(Y-yes,N-no):"); 
 
            char m = inputText.nextLine().toUpperCase().charAt(0);
            boolean isMember = false;
            if(m == 'Y')
                isMember = true;

            Cinema cinema = new Cinema(cc, mTitle, p, mp, isMember);
            CinemaLL.insertAtFront(cinema);
        }
        

        //display the count of customer in cinema code Ha111 using method detCountHa111()
        System.out.println("The number of customer in Ha111:"+detCountHa111(CinemaLL));
        
        //display the details of movie named "Enchanted" if it is exist and display 
        //an appropriate message if it is not exist
        boolean found=false;
        Cinema foundItem=null;;
        Cinema cinema = CinemaLL.getFirst();
        while(cinema != null) {
            if (cinema.getMovieTit1e().equalsIgnoreCase("Enchanted"))
            {   foundItem=cinema; 
                found=true;
            }  
            cinema = CinemaLL.getNext();
        }
        if(found==true)
            System.out.println(foundItem.toString());
        else
            System.out.println("Sorry, the movie is not exist");
            
        //a) insert at the front of cinema linked list the given value;Cinema Code:Ha111,
        //Movie Title:Taubat di Hujung Nyawa, Ticket Price: RM 24.50, 
        //Mode Payment: credit card, Member:true
        /* Node nextElement = new Node(CinemaLL.first.element);
        CinemaLL.first = new Node(new Cinema("Ha111", "Taubat di Hujung Nyawa", 24.5, "credit card", true));
        CinemaLL.current = CinemaLL.last = CinemaLL.first;
        CinemaLL.insertAtBack(nextElement.element);
        Cinema value = CinemaLL.getFirst(); */

        CinemaLL.insertAtFront(new Cinema("Ha111", "Taubat di Hujung Nyawa", 24.5, "credit card", true));
        Cinema value = CinemaLL.getFirst();
        /* while (value != null) {
            System.out.println(value.toString());
            value = CinemaLL.getNext();
        } */
        
        //b) input 2 more value into the linked list
        for (int i=0; i<2; i++) {
            System.out.println("Enter cinema code, i.e. Ha111, Ha112:"); 
            String cc = inputText.nextLine();
            System.out.println("Enter movie title:");
            String mTitle = inputText.nextLine();
            System.out.println("Enter price:");
            double p = inputNum.nextDouble();
            System.out.println("Enter mode payment(cash or credit card):");
            String mp = inputText.nextLine();
            System.out.println("Member or not(Y-yes,N-no):"); 
 
            char m = inputText.nextLine().toUpperCase().charAt(0);
            boolean isMember = false;
            if(m == 'Y')
                isMember = true;

            cinema = new Cinema(cc, mTitle, p, mp, isMember);
            CinemaLL.insertAtFront(cinema);
        }
        inputText.close(); inputNum.close();

        //c) display the the count of data in the cinema linked list
        value = CinemaLL.getFirst();
        int i = 0;
        while (value != null) {
            value = CinemaLL.getNext(); i++;
        }
        System.out.println("COUNT: " + i);

        //d) display the average price of the ticket 
        double avg, total = 0;
        value = CinemaLL.getFirst();
        while(value != null) {
            total += value.getPrice();
            value = CinemaLL.getNext();
        }
        avg = total / i;
        System.out.println("AVERAGE: " + avg);

        //e) display members detail
        value = CinemaLL.getFirst();
        int members = 0;
        while (value != null) {
            if(value.getMembership())
                members++;
            value = CinemaLL.getNext();
        }
        System.out.println("Total of Members: " + members);

        //f) display the details movie
        value = CinemaLL.getFirst();
        while (value != null) {
            System.out.println(value.toString());
            value = CinemaLL.getNext();
        }
        

    }
    
    public static int detCountHa111(LinkedList cinemaLL)
    {
        int countHa111=0;
        Cinema cinema;
        
        cinema = cinemaLL.getFirst();
        while(cinema!=null)
        {   if(cinema.getCode().equalsIgnoreCase("Ha111"))
                countHa111=countHa111+1;
            cinema=cinemaLL.getNext();
        }
        return countHa111;
    }
}
