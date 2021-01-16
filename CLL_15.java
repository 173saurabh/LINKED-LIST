//Split a circular linked list into two halves
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
public class CLL_15
{
    Node head,head1,head2;
    public void twoHalves()
    {
        Node slow_ptr=head,fast_ptr=head;
        if(head==null)
            return;
        
            while(fast_ptr.next!=head && fast_ptr.next.next!=head)
            {
                fast_ptr=fast_ptr.next.next;
                slow_ptr=slow_ptr.next;
            }
            head1=head;
            fast_ptr=slow_ptr.next;
            slow_ptr.next=head1;
            head2=fast_ptr;
            while(fast_ptr.next!=head)
            {
                fast_ptr=fast_ptr.next;
            }
            fast_ptr.next=head2;
    }
    public void printList(Node head)
    {
        Node temp=head;
        if(head!=null)
        {
            do
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        CLL_15 llist=new CLL_15();
        int n=sc.nextInt();
        llist.head=new Node(sc.nextInt());
        Node tail=llist.head;
        while(n-->1)
        {
            tail.next=new Node(sc.nextInt());
            tail=tail.next;
        }
        tail.next=llist.head;
        System.out.println("Linked List is:");
        llist.printList(llist.head);
        llist.twoHalves();
        System.out.println("Linked List 1st half is:");
        llist.printList(llist.head1);
        System.out.println("Linked List 2nd half is:");
        llist.printList(llist.head2);
    }
}
