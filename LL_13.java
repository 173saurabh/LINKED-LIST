//Reverse a linked lis
import java.util.*;
public class LL_13
{
    static class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public void printList(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LL_13 llist=new LL_13();
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node tail=head;
        for(int i=0;i<n-1;i++)
        {
            tail.next=new Node(sc.nextInt());
            tail=tail.next;
        }
        llist.printList(head);
        System.out.println("List after swapping:");
        head=llist.reverse(head);
        llist.printList(head);
    }
}
