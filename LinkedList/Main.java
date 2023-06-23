package LinkedList;

// import org.w3c.dom.Node;

public class Main {
     public static void main(String[] args) {
       
        LinkedList l = new LinkedList();
        l.insertAtEnd(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(9);
        l.insertAtEnd(7);
        // l.insertAtEnd(6);
        l.display();
        System.out.println(l.middle());
        
        // l.deleteFromEnd(3);

        // l.delete(2);
        // l.display();
        // System.out.println("Maximum Element: " + l.max());
        // System.out.println("Index: " + l.findIndex(9));
      //   System.out.println("MidNode: " + l.middleNode(l.head));

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
