//printing reverse of a linked list without actually reversing.
import java.util.*;
public class LL_11
{
    Node head;
    class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void push(int data)
    {
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void printList()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    public void printReverse(Node head)
    {
        if(head==null)
        {
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LL_11 llist=new LL_11();
        System.out.println("Enter the number of nodes you want to create:");
        int n=sc.nextInt();
        System.out.println("Enter the nodes:");
        for(int i=0;i<n;i++)
        {
            llist.push(sc.nextInt());
        }
        System.out.println("List before swapping:");
        llist.printList();
        llist.printReverse(llist.head);
    }
}
