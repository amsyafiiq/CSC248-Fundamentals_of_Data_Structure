public class Queue extends LinkedList {
    public Queue() {
    }

    public void enqueue(GoKart element) {
        insertAtBack(element);
    }

    public GoKart dequeue() {
        return removeFromFront();
    }

    public GoKart getFront() {
        return getFirst();
    }

    public GoKart getLast() {
        return getLast();
    }
}