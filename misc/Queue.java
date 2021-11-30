import universal_LLnNode.LinkedList;

/***
Coder: Roslan S, UiTM Pahang, roslancs@uitm.edu.my
Year: 2012
***/

public class Queue <E> extends LinkedList <E>
{
    public Queue() {}
    
    public void enqueue(E element) {
        addLast(element);
    }
    
    public E dequeue() {
        return removeFirst();
    }
    
    public E getFront() {
        return getFirst();
    }
    
    public E getEnd()
    {	return getLast();}
}
