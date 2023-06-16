package LinkedList;

public class LinkedList
{
    private Node head;
    private Node tail;

    private class Node
    {
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public void insertAtBeginning(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail==null)
        {
            tail=head;
        }
    }

    public void insertAtEnd(int val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head = newNode;
        }

        Node curr = head;

        while(curr.next!=null)
        {
            curr = curr.next;
        }

        curr.next = newNode;
        tail = newNode;
    }

    public void display()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("END");
    }

    public void insert(int index, int val)
    {
        Node newNode = new Node(val);
        Node curr = head;

        for(int i=1; i<index; i++)
        {
            curr = curr.next;
        }
        Node prev = curr.next;
        newNode.next = prev;
        curr.next = newNode;
    }
}