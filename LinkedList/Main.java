package LinkedList;

// import org.w3c.dom.Node;

public class Main {
     public static void main(String[] args) {
       
        LinkedList l = new LinkedList();
        l.insertAtBeginning(8);
        l.insertAtEnd(5);
        l.insertAtEnd(9);
        l.insertAtEnd(0);
        l.insert(2, 0);
        l.display();

        l.delete(2);
        l.display();
        System.out.println("Maximum Element: " + l.max());
        System.out.println("Index: " + l.findIndex(9));

        // l.deleteFromEnd();
        // l.display();
        
        // l.deleteFromBeginning();
        // l.display();
       

       /* 
       DoublyLinkedList dl = new DoublyLinkedList();
       dl.insertAtBeginning(1);
       dl.insertAtBeginning(9);
       dl.insertAtBeginning(8);
       dl.insertAtEnd(10);
       dl.display();
       */
    }
}
