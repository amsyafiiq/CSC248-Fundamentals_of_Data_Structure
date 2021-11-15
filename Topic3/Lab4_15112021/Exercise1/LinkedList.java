package Exercise1;

/*
LinkedList class definition
*/

public class LinkedList 
{	
public Node first, last, current;
	
	public void insertAtFront(Cinema obj) {
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
        }
        else {
    		this.current = this.first;
    		return this.current.element;
    	}
    }

	public Cinema getNext() {
		if (this.current == this.last) 
		{
			return null;
    	}
        else 
		{
			this.current = this.current.next;
			return this.current.element;
        }
	}
}
