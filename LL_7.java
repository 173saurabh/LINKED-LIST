//Length of a linked list recursive.
import java.util.*;
public class LL_7
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
    public void append(int data)
    {
        Node new_node=new Node(data);
        int count=0;
        if(head==null)
        {
            head=new Node(data);
            return;
        }
        new_node.next=null;
        Node prev=null,n=head;
        while(n!=null)
        {
            prev=n;
            n=n.next;
        }
        prev.next=new_node;
    }
    public int getCountRec(Node node)
    {
       if(node==null)
       {
           return 0;
       }
       return 1 + getCountRec(node.next);
    }
    public int getCount()
    {
        return getCountRec(head);
    }
    public static void main(String args[])
    {
        LL_7 llist=new LL_7();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            llist.append(sc.nextInt());
        }
        System.out.println(llist.getCount()+" ");
    }
}
