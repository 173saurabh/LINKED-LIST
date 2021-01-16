//Sorted insert for circular linked list.
import java.util.*;
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
public class CLL_16
{
    Node head;
    public void sortedInsert(Node new_node)
    {
        Node current=head;
        if(current==null)
        {
            new_node.next=new_node;
            head=new_node;
        }
        else if(current.data>=new_node.data)
        {
            while(current.next!=head)
            {
                current=current.next;
            }
            current.next=new_node;
            new_node.next=head;
            head=new_node;
        }
        else
        {
            while(current.next!=head && current.next.data<new_node.data)
            {
                current=current.next;
            }
            new_node.next=current.next;
            current.next=new_node;
        }
    }
    public void printList()
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
        CLL_16 llist=new CLL_16();
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        Node temp=null;
        System.out.println("enter the nodes");
        for(int i=0;i<n;i++)
        {
            temp=new Node(sc.nextInt());
            llist.sortedInsert(temp);
        }
        System.out.println("The sorted circular linked list is:");
        llist.printList();
    }
}
