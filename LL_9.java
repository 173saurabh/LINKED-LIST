//Function to delete a linked list.
import java.util.*;
public class LL_9
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
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public void deleteList()
    {
        head=null;
    }
    public static void main(String args[])
    {
        LL_9 llist=new LL_9();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            llist.push(sc.nextInt());
        }
        System.out.println("Deleting Linked List");
        llist.deleteList();
        System.out.println("Linked List deleted");
    }
}
