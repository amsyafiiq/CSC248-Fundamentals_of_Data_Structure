package universal_LLnNode;

/***************************************************************************
 * Programmer: Roslan Sadjirin, UiTM (Raub, Pahang)
 * Date: 2020-11-03
 * Topic 3 - Node Manipulation / LinkedList
 ***************************************************************************/
public class Node<E> {
	public E element;
	public Node<E> next;
	
	public Node(E e) { 
		element = e;
	}
}