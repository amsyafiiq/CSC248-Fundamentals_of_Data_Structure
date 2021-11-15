import topic3.universal_LLnNode.Node;

/**
 * Write a node application that will initialize the node A K S U and arrange into words S U K A
 */
public class SukaApp {

    public static void main(String[] args) {
        Node<String> head, current = null;

        Node<String> node = new Node<>("A");  // node = "A", A
        head = node;                          // head = "A"

        node = new Node<>("K");               // node = "K", K A
        node.next = head;                     // node.next = "A"
        head = node;                          // head = "K"

        node = new Node<>("S");               // node = "S", S K A
        node.next = head;                     // node.next = "K"
        head = node;                          // head = "S"

        node = new Node<>("U");               // node = "U", S U K A
        node.next = head.next;                // node.next = "K"
        head.next = node;                     // head.next = "U"

        current = head;
        System.out.println("Output:-");
        while (current != null) {
            String str = current.element;
            System.out.print(str + " ");
            current = current.next;
        }
    }
}