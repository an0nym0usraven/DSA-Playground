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