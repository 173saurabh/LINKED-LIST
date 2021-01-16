
//Introduction & Insertion
import java.util.*;
public class DLL_17
{
    Node head;
    class Node
    {
        Node next,prev;
        int data;
        Node(int d)
        {
            data=d;
        }
    }
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        new_node.prev=null;
        
        if(head!=null)
            head.prev=new_node;
        head=new_node;
    }
    public void insertAfter(Node prev_node,int new_data)
    {
        if(prev_node==null)
        {
            System.out.println("Previous Node does not exist");
            return;
        }
        Node new_node=new Node(new_data);
        
        new_node.next=prev_node.next;
        prev_node.next.prev=new_node;
        
        prev_node.next=new_node;
        new_node.prev=prev_node;
        
    }
    public void append(int new_data)
    {
        Node new_node=new Node(new_data);
        if(head==null)
        {
            head=new_node;
            return;
        }
        Node temp=head;
        new_node.next=null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
    }
    public void printList()
    {
        Node temp=head;
        Node last=null;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            last=temp;
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Reverse of the linked list:");
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last=last.prev;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        DLL_17 ob=new DLL_17();
        
        ob.append(6);
        ob.push(7);
        ob.push(1);
        ob.append(4);
        ob.insertAfter(ob.head.next,8);
        System.out.println("The doubly linked list is:");
        ob.printList();
    }
}
