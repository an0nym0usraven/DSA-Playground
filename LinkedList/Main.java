package LinkedList;

// import org.w3c.dom.Node;

public class Main {
     public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtBeginning(8);
        l.insertAtEnd(5);
        l.insert(2, 0);
        l.display();

        l.delete(2);
        l.display();

        l.deleteFromEnd();
        l.display();
        
        l.deleteFromBeginning();
        l.display();
    }
}
