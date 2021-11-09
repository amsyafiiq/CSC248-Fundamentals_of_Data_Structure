# Topic 2 Class Exercise | 21 October 2021

## Exercise 1

Write a `Java` program for the following process:-

* Create 2 `ArrayList` named `aList` and `sList`.
* Insert the following numbers and store them into `aList`. `12, 78, 1, 7, 90`
* Replace element at location `3` with `100`.
* Remove all numbers that can be devided by 3 from `aList` and store them into `sList`.
* Display the contents of teh `aList` and `sList`.
* Display the size of the `aList` and `sList`.
* Calculate and display the sum of numbers in `sList`.

## Exercise 2 | Try yourself :satisfied:

Draw the value in the `ArrayList` and determine output for the following statement
```
class ArrayListTracing { 
	public static void main(String args[]) { 
	     ArrayList trace = new ArrayList(); 
	     System.out.println("Initial size of trace: " + trace.size()); 
	     trace.add("T"); 
	     trace.add("E"); 
	     trace.add("T"); 
	     trace.add("O"); 
	     trace.add("N"); 
	     trace.add("E"); 
	     trace.add(2, "S"); 
	     System.out.println("Size of trace after additions: "  +  trace.size()); 
	     System.out.println("Contents of trace: " + trace); 
	     trace.remove("E"); 
	     trace.remove(1); 
	     System.out.println("Size of trace after deletions: "  +  trace.size()); 
	     System.out.println("Contents of trace: " + trace); 
	} 
}
```

## Exercise 3

Write a `Java` application that perform the following tasks:-

* Declaring an `ArrayList` caled `floatList`
* Insert **4** floating point number into `floatList` at the front.
* Insert a floting point number in between location 2 and 3 of `floatList`.
* Printing the elements of `floatList`.
* Removing the second element of `floatList` and print the output
* Calculate and display the sum of numbers in `floatList`.
