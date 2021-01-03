//Deleting a linked list node at a given position.
import java.util.*;
public class LL_6
{
    Node head;
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
    public void push(int data)
    {
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void deleteNode(int position)
    {
        Node prev=null,n=head;
        int count=0;
        if(n==null)
            return;
        if(n!=null && count==position)
        {
            head=n.next;
            return;
        }
        while(n!=null && count!=position)
        {
            prev=n;
            n=n.next;
            count++;
        }
        if(n==null)
        {
            return;
        }
        prev.next=n.next;
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
    public static void main(String args[])
    {
        LL_6 llist=new LL_6();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the linked list:");
        for(int i=0;i<5;i++)
        {
            llist.push(sc.nextInt());
        }
        System.out.println("The linked list is:");
        llist.printList();
        System.out.println("Enter the position of the node which is to be deleted:");
        llist.deleteNode(sc.nextInt());
        System.out.println("The linked list after deleting the node at the particular position is:");
        llist.printList();
    }
}
