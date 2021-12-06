package Exercise2;

public class LinkedList {
    private Node first, last, current;
    
    public LinkedList() {
        first = last = current = null;
    }

    public void insertAtFront (Debtor element) {
        Node newNode = new Node(element);
        newNode.next = this.first;
        this.first = newNode;

        if (this.last == null) {
            this.last = this.first;
        }
    }

    public void insertAtBack (Debtor element) {
        Node newNode = new Node(element);

        if (this.last == null) {
            this.first = this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = this.last.next;
        }
    }

    public Debtor getFirst() {
        if (this.first == null)
            return null;
        else {
            this.current = this.first;
            return this.current.element;
        }
    }

    public Debtor getNext() {
        if (this.current == this.last) 
            return null;
        else {
            this.current = this.current.next;
            return this.current.element;
        }
    }

    public Debtor getLast() {
        if (this.current == this.last)
            return this.current.element;
        else {
            this.current = this.last;
            return this.current.element;
        }
    }
}