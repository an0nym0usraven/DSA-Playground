package LinkedList;

import org.w3c.dom.Node;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    class Node
    {
        private int data;
        private Node next;

        Node(int d)
        {
            data = d;
        }
    }

    public void insert(int val)
    {
        Node node = new Node(val);

        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display()
    {
        Node curr = head;
        if(head != null)
        {
            do
            {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            while(curr != head);
        }
        else
        System.out.print("HEAD");
    }

    public void delete(int val)
    {
        Node curr = head;
        if(head == null)
        {
            return;
        }

        if(curr.data == val)
        {
            head = head.next;
            tail.next = head;
            return;
        }

        do
        {
            if(curr.next.data == val)
            {
                curr.next = curr.next.next;
                break;
            }
        }
        while(curr != head)
    }
}
