//Swap nodes in a linked list without swapping data.
import java.util.*;
public class LL_10
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
    public void swapNodes(int x,int y)
    {
        if(x==y)
        {
            return;
        }
        Node prevX=null,currX=head;
        while(currX!=null && currX.data!=x)
        {
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null,currY=head;
        while(currY!=null && currY.data!=y)
        {
            prevY=currY;
            currY=currY.next;
        }
        if(currX==null || currY==null)
        {
            return;
        }
        if(prevX!=null)
            prevX.next=currY;
        else
            head=currY;
        if(prevY!=null)
            prevY.next=currX;
        else
            head=currX;
            
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LL_10 llist=new LL_10();
        System.out.println("Enter the number of nodes you want to create:");
        int n=sc.nextInt();
        System.out.println("Enter the nodes:");
        for(int i=0;i<n;i++)
        {
            llist.push(sc.nextInt());
        }
        System.out.println("List before swapping:");
        llist.printList();
        System.out.println("Enter the nodes for swapping");
        llist.swapNodes(sc.nextInt(),sc.nextInt());
        System.out.println("List after swapping:");
        llist.printList();
    }
}
