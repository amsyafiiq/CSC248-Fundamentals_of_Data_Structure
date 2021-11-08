## Exercise 1

Given the following `Invoice` ADT:-
```
public class Invoice {
    private int orderID;
    private String custName;
    private String prodName;
    private int prodQuantity;
    private double unitPrice;

    public Invoice (int oid, String cn, String pn, int pq, double up) {...}
    public int getOrderID() {...}
    public String getCustName() {...}
    public String getProdName() {...}
    public int getProdQuantity() {...}
    public double getUnitPrice() {...}
    public String toString() {...}
}
```

Write a `Java` application to solve the following problems:-

1. Input 6 invoices into a sequential list name `Invoice`.
2. Count the number of invoices where the `unitPrice` is more than *RM 5000*
3. Calculate the total payment of each invoices. The payment is calculated by multiplying `prodQuantity` and `unitPrice`.
4. Display the information of invoice that maeks the highest payment.

## Exercise 2

Given the attribute and behavior of Lecturer class:-
```
Attribute:
    Name (String), StaffID(int), Grade(int) e.g 41, 51, 52
Behavior:
    Normal Constructor
    Retriever Method
    Display Method
```
1. Write a complete class definition for `Lecturer`
2. Write a main application that will:
    * Declare an `ArrayList` named `lectArr` of type `Lecturer`.
    * Input 5 `Lecturer` data.
    * Display the count of grade `52` lecturers.
    * Sort the lecturers data according to name into alphabetical order.
    * Display the content of sorted data.
    * Display the details of lecturer name `"Yusuf"` if exist and display an appropriate message if not found.
    * Sort the lecturer data based on grade and then name.