//Find the middle of a given linked list in Java
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class LL_12
{
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
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node tail=head;
        for(int i=0;i<n-1;i++)
        {
            tail.next=new Node(sc.nextInt());
            tail=tail.next;
        }
        LL_12 llist=new LL_12();
        llist.printList(head);
        CFG ll=new CFG();
        int mid=ll.mid(head);
        System.out.println(mid);
    }
}
class CFG
{
    public int mid(Node head)
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
}
