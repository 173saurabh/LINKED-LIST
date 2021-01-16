//Circular Linked List(Traversal)
import java.util.*;

public class CLL_14
{
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
        }
    }
    public Node push(Node head_ref,int new_data)
    {
        Node ptr=new Node(new_data);
        Node temp=head_ref;
        ptr.next=head_ref;
        if(head_ref!=null)
        {
            while(temp.next!=head_ref)
            {
                temp=temp.next;
            }
            temp.next=ptr;
        }
        else
        {
            ptr.next=ptr;
        }
        head_ref=ptr;
        return head_ref;
    }
    public void printList(Node head)
    {
        Node n=head;
        if(head!=null)
        {
            do
            {
                System.out.print(n.data+" ");
                n=n.next;
            }
            while(n!=head);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        CLL_14 llist=new CLL_14();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of node of list:");
        int n=sc.nextInt();
        Node head=null;
        System.out.println("Enter the nodes of the list:");
        for(int i=0;i<n;i++)
        {
            head=llist.push(head,sc.nextInt());
        }
        System.out.println("The linked list is:");
        llist.printList(head);
    }
}
