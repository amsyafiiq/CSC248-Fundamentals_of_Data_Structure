# Lab Session 4

## Exercise 1

Given the `Node` class definition, `LinkedList` class definition, `Cinema` class definition and application class:-

```
public class Node {
	Cinema element;
	Node next;
	
	public Node(Cinema element) {
		this.element = element;
	}
}
```

```
public class LinkedList {	
    public Node first, last, current;
	
	public void insertAtBack(Cinema obj) {
		Node newNode = new Node(obj);
        	newNode.next = this.first;
       	 	this.first = newNode;          
            if(this.last == null) {
                    this.last = this.first;
            }	
	}
	public Cinema getFirst() {
        if (this.first == null) {
            return null;
        } else {
            this.current = this.first;
            return this.current.element;
        }
    }
	public Cinema getNext() {
		if (this.current == this.last) {
			return null;
        } else {
			this.current = this.current.next;
			return this.current.element;
        }
	}
}
```

```
public class Cinema {	
	private String cinCode ; 		//cinema code, i.e. Ha111, Hal12 
	private String movieTit1e;
	private double price; 
	private String modePayment; 	//cash or credit card 
	private boolean membership; 	//true: member, false: non-member
	
	//normal constructor
	public Cinema(String cc, String mt, double p, String mp, boolean m) {
		this.cinCode = cc;
		this.movieTit1e = mt;
		this.price = p;
		this.modePayment = mp;
		this.membership = m;
	}
	
	//accesors: getCode(), getTit1e(), getPrice(), getMode(), getMembership()
	public String getCode() { return this.cinCode; }
	public String getMovieTit1e() { return this.movieTit1e; }
	public double getPrice() { return this.price; }
	public String getMode() { return this.modePayment; }
	public boolean getMembership() { return this.membership; }	
	
	//printer: toString()
	public String toString() {
		return "Cinema code: " + this.getCode() + "\n" +
			   "Movie Title: " + this.getMovieTit1e() + "\n" +
			   "Price: " + this.getPrice() + "\n" +
			   "Payment Mode:" + this.getMode() + "\n" +
			   "Membership:" + this.getMembership() + "\n";	
	}
}
```

```
import java.util.*;
public class CinemaApp {
    public static void main(String[] args) {

        Scanner inputNum =  new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        LinkedList CinemaLL = new LinkedList();
        for (int i=0; i<3; i++) {
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
            CinemaLL.insertAtBack(cinema);
        }
        
        //display the count of customer in cinema code Ha111 using method detCountHa111()
        System.out.println("The number of customer in Ha111:"+detCountHa111(CinemaLL));
        
        //display the details of movie named "Enchanted" if it is exist and display 
        //an appropriate message if it is not exist
        boolean found=false;
        Cinema foundItem=null;;
        Cinema cinema = CinemaLL.getFirst();
        while(cinema != null) {
            if (cinema.getMovieTit1e().equalsIgnoreCase("Enchanted")) {
                foundItem=cinema; 
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
        
        //b) input 2 more value into the linked list
        
        //c) display the the count of data in the cinema linked list
        
        //d) display the average price of the ticket 
        
        //e) display members detail
        
        //f) display the details movie
        
        

    }
    
    public static int detCountHa111(LinkedList cinemaLL) {
        int countHa111=0;
        Cinema cinema;
        
        cinema = cinemaLL.getFirst();
        while(cinema!=null) {
            if(cinema.getCode().equalsIgnoreCase("Ha111"))
                countHa111=countHa111+1;
            cinema=cinemaLL.getNext();
        }
        return countHa111;
    }
}
```  

Your Task:  
Write the coding for cinema application _a)_ until _f)_  

## Question 2

Given the following `Debtor`, `Node` and `LinkedList` ADTs:-

```
class Debtor {
    private String name;
    private double salary;
    private double amount;
    private String category;

    /*** Definition of the other methods including normal constructor, accessor, mutator and toString printer ***/
}
```
```
class Node {
    Debtor element;
    Node next;
    public Node (Debtor element) {...}
}
```
```
class LinkedList {
    private Node first, last, current; 
    public LinkedList() {...}
    public void insertAtFront(Debtor element) {...}
    public void insertAtBack(Debtor element) {...}
    public Debtor getnext() {...}
    public Debtor getFirst() {...}
    public Debtor getlast() {...}

    /*** Definition of the other methods ***/
}
```

Your task are:-  
1. Write a complete definition of `Debtor` class
2. Write a complete definition of `Node` class
3. Write a comple definition of `LinkedList` class
4. Write a main application that will:-
    * Declare the `LinkedList` named `debtorList`
    * Insert the given value at the front of `debtorList`
        ```
        Name: Ahmad Sulung bin Razak
        Salary: RM 5800.70
        Amount of Debt: RM 30390.00
        Category: 2
        ```
        ```
        Name: Juliana binti Ahmad Kamil
        Salary: 8880.80
        Amount of Debt: 70000.00
        Category: 2
        ```
    * Insert 3 more data at the back of `debtorList`
    * Display the details of all debtors with a salary above RM 2000.00
    * Display the total amount of loans for category "1" debtors by calling `count1()` method
    * Display the name and amount to be paid by each debtor with the interest rate of `15%`. The calculation of amount to be paid is as follow  
    amount to be paid = (loan amount * interest rate) + loan amount
    * Write a method named `count1()` that will calculate and return the total amount of all loans for category "1" debtors