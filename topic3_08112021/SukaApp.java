/**
 * Write a node application that will initialize the node A K S U and arrange into words S U K A
 */
public class SukaApp {

    public static void main(String[] args) {
        Node<String> head, tail, current = null;

        Node<String> node = new Node<>("A");
        head = tail = node; // head = tail = node = "A"

        node = new Node<>("K"); // node = "K"
        node.next = head;       // node.next = "A"
        head = node;            // head = "K"

        node = new Node<>("S"); // node = "S"
        node.next = head;       // node.next = "K"
        head = node;            // head = "S"

        node = new Node<>("U"); // node = "U"
        node.next = head.next;  // node.next = "K"
        head.next = node;       // head.next = "U"

        current = head;
        System.out.println("Output:-");
        while (current != null) {
            String str = current.element;
            System.out.print(str + " ");
            current = current.next;
        }
    }
}