//Search an element in a linked list(Recursive).
import java.util.*;
public class LL_8
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
    public boolean search(Node head,int x)
    {
        if(head==null)
        {
            return false;
        }
        if(head!=null && head.data!=x)
            return search(head.next,x);
        return true;
    }
    public static void main(String args[])
    {
        LL_8 llist=new LL_8();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            llist.push(sc.nextInt());
        }
        if(llist.search(llist.head,sc.nextInt()))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
