public class LinkedList {
    private Node head, tail, current;

    public LinkedList() {
        head = tail = current = null;
    }

    public void insertAtBack(GoKart element) {
        Node newNode = new Node(element);

        if (this.tail == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
    }

    public GoKart getFirst() {
        if (this.head == null)
            return null;
        else {
            this.current = this.head;
            return this.current.element;
        }
    }

    public GoKart getLast() {
        if (this.current == this.tail)
            return this.current.element;
        else {
            this.current = this.tail;
            return this.current.element;
        }
    }

    public GoKart removeFromFront() {
        if (this.isEmpty()) {
            return null;
        } else {
            this.current = this.head;
            this.head = this.head.next;
            if (this.head == null)
                this.tail = null;
            return current.element;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}