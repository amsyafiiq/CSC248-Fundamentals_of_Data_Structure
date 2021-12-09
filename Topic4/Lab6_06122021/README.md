# Lab Session 6 | 06 December 2021

A Go-Kart Operator uses a Queue to store the data of Go-kart customers. The following classes are used for this purpose.

```
public class GoKart {
    private String name;  //customer name
    private String typeOfCar; //couple or single seat
    private String strokeEngine; //200cc or 150cc
    private  int option; 	//1- quick experience
                            //2- race adventure
    private int numberOfLaps; 
    private boolean safetySet;//true if choose safety set

    public GoKart(String name, String type,String stroke,int option,int numLap,boolean safetySet)
    public String getName() {..}
    public String getType() {..}
    public String getEngineStroke() {..}
    public int getOption() {..}
    public int getNumLaps() {..}
    public boolean getSafetySet() {..}
    public String toString() {..}
}
```
```
public class Node {
	GoKart element;
	Node next;
	public Node(GoKart element) {..}
}
```

```
public class LinkedList{
     private Node head,current,tail;
	public void insertAtBack(GoKart element) {..}
	public GoKart removeFromFront(){..}
	public boolean isEmpty(){..}
	public GoKart getFirst(){..}
	public GoKart getLast(){..}
}
```

```
public class Queue extends LinkedList {
    public Queue() {}
    
    public void enqueue(GoKart element) {..}
    public GoKart dequeue() {..}   
    public GoKart getFront() {..}
    public GoKart getLast() {..}
}
```

1. Write the definition for `Gokart`, `Node`, `LinkedList` and `Queue` class
2. Write a main method that will do the following:
    * Declare a queue named `GKQueue` and `tempQ`
    * Insert the given data into `GKQueue`
        ```
        Name: Yusof Hamid
        typeOfCar: couple
        strokeEngine:1 50cc
        option: 2
        numberOfLaps: 3
        safetySet:f alse
        ```
        ```
        Name:Juliana Ahmad
        typeOfCar:single
        strokeEngine:200cc
        option:1
        numberOfLaps:2
        ```
        ```
        Name:Ahmad Rizal Roslan
        typeOfCar:single
        strokeEngine:200cc
        option:2
        numberOfLaps:4
        safetySet:false
        ```
    * Insert another 2 data into `GKQueue`
    * Display all the details for customer
    * Calculate and display the total charge received from all customers. Each customer will be charged RM 30 for each lap and RM 20 if they use safety laps set.
    * Copy and insert the data of customer that choose option race adventure into `raceAdvQ` queue
    * Display the data in the `raceAdvQ` queue