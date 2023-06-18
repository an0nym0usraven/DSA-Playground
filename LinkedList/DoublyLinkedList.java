package LinkedList;

public class DoublyLinkedList
{
    private Node head;

    public void insertAtBeginning(int val)
    {
        Node newNode = new Node(val);
        
        newNode.prev = null;
        newNode.next = head;
        if(head != null)
        {
            head.prev = newNode;  
        }
        head = newNode;
    }

    public void display()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void insertAtEnd(int val)
    {
        Node newNode = new Node(val);
    
        if(head == null)
        {
            newNode.prev = null;
            head = newNode;
            newNode.next = null;
            return;
        }

        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }

        newNode.next = null;
        newNode.prev = curr;
        curr.next = newNode;
    }

    
    private class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data, Node next, Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}