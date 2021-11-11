/*******************************************************************
ASSESSMENT #1: PRACTICAL/LAB TEST
CLASS APPLICATION: CSC248As1
Name: MUHAMMAD AMIRUL SYAFIQ BIN MOHD NOR
Student ID: 2020620108
Group: CS1103A
*******************************************************************/
import java.util.*;
import java.io.*;

public class CSC248As1 {
	
	public static void main(String[] args) throws Exception {
		
		//Question 1 - declare and instantiate ArrayList object to store Covid19Cases data						
        ArrayList<Covid19Cases> c19List = new ArrayList<Covid19Cases>(); 

		//Question 2 - declare and instantiate BufferedReader object and its related classes to read data from covid19cases.txt
		BufferedReader br = new BufferedReader(new FileReader("assessment/test1_10112021/covid19cases.txt"));

		//Question 3 - declare and instantiate PrinterWriter object and its related classes to write data into covid19Report.txt
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("assessment/test1_10112021/covid19Report.txt")));
		
		//Question 4 - read data 
		String data = null;
        while((data = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(data, "-");
            String state = st.nextToken();
            int noCase = Integer.parseInt(st.nextToken());

            c19List.add(new Covid19Cases(state, noCase));
        }
        br.close();

		//Question 5 - Data at index 4, change "Negeri Sembilan" to "Negeri 9"	
        c19List.get(4).setState("Negeri 9");
			
		//Question 6 - Sort the data in c19List in ascending order using Bubble Sort			
		for (int i = 0; i < c19List.size(); i++) {
            for (int j = 1; j < c19List.size() - i; j++) {
                if (c19List.get(j - 1).getNoCase() > c19List.get(j).getNoCase()) {
                    Covid19Cases temp = c19List.get(j - 1);
                    c19List.set(j - 1, c19List.get(j));
                    c19List.set(j, temp);
                }
            }
        }

		//Question 7 - Write the data into "covid19Report.txt"
        for(int i = 0; i < c19List.size(); i++) {
            pw.println(c19List.get(i).toString());
        }
        pw.close();

		//Question 8 - Display the data from c19List
        System.out.println("Malaysia CoViD-19 cases by state in ascending order.\n");
        for(int i = 0; i < c19List.size(); i++) {
            System.out.println(c19List.get(i).toString());
        }

		System.out.println("\nProgram halted.");			
	}	
}

/*******************************************************************
CLASS DEFINITION: Covid19Cases ADT
*******************************************************************/
class Covid19Cases {

	private String state;
	private int noCase;
	
	//normal constructor
	public Covid19Cases(String s, int n) {
		this.setState(s);
		this.setNoCase(n);
	}
	
	//mutator
	public void setState(String s) { this.state = s; }
	public void setNoCase(int n) { this.noCase = n; }
	
	//retriever
	public String getState() { return this.state; }
	public int getNoCase() { return this.noCase; }
	
	//printer
	public String toString() {
		return this.getState()+ ": " +this.getNoCase();
	}	
}

/*******************************************************************
CLASS DEFINITION: ArrayList ADT
*******************************************************************/
/* class ArrayList <E>{
    
    private int size = 0;
    public static int INITIAL_CAPACITY = 20;
    private E[] data = (E[]) (new Object[INITIAL_CAPACITY]);

    public ArrayList(){}   
    
    public ArrayList(int newCapacity) {
        this.INITIAL_CAPACITY = newCapacity;
    }

    public ArrayList(E[] element)
    {
        for(int i=0; i<element.length; i++)
            this.add(element[i]);        
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public int size(){ return this.size; }
    
    private void ensureCapacity()
    {
        if(this.size >= this.data.length)
        {
            E[] newData = (E[]) (new Object[this.size * 2 + 1]);
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data=newData;
        }
    }      
    
    public void add(int index, E element) {
        this.ensureCapacity();
        
        for (int i=this.size-1; i>=index; i--)        
            this.data[i+1] = this.data[i];   
           
        this.data[index] = element;  
        this.size++;
        
    }
    
    public void add(E element) { 
        add(size, element); 
    } 
    
    public E get(int index) {
        return this.data[index];
    }

    public void clear() {
        this.data = (E[]) (new Object[this.INITIAL_CAPACITY]);
        this.size=0;     
    }

    public boolean contains(E element) {
        for (int i=0; i<size; i++)
            if(element.equals(data[i])) 
                return true;
        return false;
    }

    public int indexOf(E element) {
        for(int i=0; i<this.size; i++)
            if(element.equals(this.data[i]))
                    return i;
        return -1;
    }
    
    public int lastIndexOf(E element) {
        for(int i=this.size-1; i>= 0; i--)
            if(element.equals(this.data[i]))
                return i;
        return -1;      
    }   

    public E remove(int index) {
        E element = data[index];
        
        for(int j=index; j<this.size-1; j++)
            this.data[j]=this.data[j+1];
        
        this.data[this.size-1] = null;
        this.size--;     
        return element;
    }
    
    public boolean remove(E element) {
        if(indexOf(element) >= 0){
            remove(indexOf(element));
            return true;
        }
        else {
            return false;
        }
    }

    public E set(int index, E element) {
        E old = this.data[index];
        this.data[index] = element;        
        return old;
    }
    
    public String toString()
    {
        this.trimToSize();
        StringBuilder result = new StringBuilder("[");
        
        for(int i =0; i<size(); i++)
        {
            result.append(data[i]);
            if(i<this.size-1)
                result.append(", ");
        }
        return result.toString() + "]";
    }

    public void trimToSize() {
        if(this.size != this.data.length) {
            E[] newData = (E[]) (new Object[this.size]);
            System.arraycopy(data, 0, newData, 0, this.size);
            this.data = newData;     
        }
    }       
} */