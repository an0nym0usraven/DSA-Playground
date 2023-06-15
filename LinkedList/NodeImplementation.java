package LinkedList;

// Geek loves linked list data structure. Given an array of integer arr of size n, Geek wants to construct the linked list from arr.

// Construct the linked list from arr and return the head of the linked list.


class Node
{
    int data;
    Node next;

    Node()
    {
        data = 0;
    }
    Node(int d)
    {
        data = d;
    }
}

public class NodeImplementation {
    public static Node main(String[] args) {
        int[] arr = {56,23,2,1,65,87};
        
        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i=1; i<arr.length; i++)
        {
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            curr = newNode;
        }

        return head;
    }
}
