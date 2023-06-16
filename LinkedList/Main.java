package LinkedList;

// import org.w3c.dom.Node;

public class Main {
     public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtBeginning(8);
        l.insertAtBeginning(4);
        l.insertAtEnd(78);
        l.insertAtEnd(8);
        l.insert(2, 5);
        l.display();
    }
}
