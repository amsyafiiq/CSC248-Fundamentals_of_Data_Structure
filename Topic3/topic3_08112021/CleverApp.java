import universal_LLnNode.Node;

/**
 * Write a node application that will initialize the node V E C R E L and arrange into words C L E V E R
 */
public class CleverApp {

    public static void main(String[] args) {
        Node<String> head, tail, current = null;

        Node<String> node = new Node<>("V");   // Node = "V", V
        head = tail = node;                    // Head = "V", Tail = "V"

        node = new Node<>("E");                // Node = "E", E V
        node.next = head;                      // Node.next "V"
        head = node;                           // Head = "E"
        
        node = new Node<>("C");                // Node = "C", C E V
        node.next = head;                      // Node.next = "E"
        head = node;                           // Head = "C"

        node = new Node<>("R");                // Node = "R" C E V R
        tail = node;                           // tail = "R"

        node = new Node<>("E");                // Node = "E", C E V E R
        node.next = tail;                      // node.next = "R"
        head.next.next.next = node;            // head.next.next.next = "E"

        node = new Node<>("L");                // Node = "L", C L E V E R
        node.next = head.next;                 // Node.next = "E"
        head.next = node;                      // head.next = "L"

        current = head;
        System.out.println("Output:-");
        while (current != null) {
            String str = current.element;
            System.out.print(str + " ");
            current = current.next;
        }
    }
}