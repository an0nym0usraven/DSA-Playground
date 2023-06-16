package LinkedList;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int size;

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

        size++;
    }

    public void insertAtEnd(int val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head = newNode;
            return;
        }

        /*
        Node curr = head;
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = newNode;
        */

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void display()
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("END\n");

        // System.out.println("\nhead: " + head.data);
        // System.out.println("tail: " + tail.data);
    }

    public void insert(int index, int val)
    {
        if(index == 0)
        {
            insertAtBeginning(val);
            return;
        }
        if(index == size)
        {
            insertAtEnd(val);
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;

        for(int i=1; i<index; i++)
        {
            curr = curr.next;
        }
        Node prev = curr.next;
        newNode.next = prev;
        curr.next = newNode;

        size++;
    }

    public int deleteFromBeginning()
    {
        int val = head.data;
        head = head.next;
        
        if(head == null)
        {
            tail=null;
        }

        size--;

        return val;
    }

    public int deleteFromEnd()
    {
        if(size<=1)
        {
            deleteFromBeginning();
        }

        Node secondLast = get(size-2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index)
    {
        Node curr = head;
        for(int i = 0; i<index; i++)
        {
            curr = curr.next;
        }
        return curr;
    }

    public int delete(int index)
    {
        /* 
          Node curr = head;
        // Node prev = curr;
        while(curr.next.next!=null)
        {
            if(curr.next.data == val)
            {
                curr.next = curr.next.next;
                break;
            }
            else
            {
                curr = curr.next;
            }
        }
        */

        if(index == 0)
        {
            return deleteFromBeginning();
        }
        if(index == size-1)
        {
            return deleteFromEnd();
        }

        Node prev = get(index-1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int val)
    {
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == val)
            return curr;
            curr = curr.next;
        }
        return null;
    }
}
