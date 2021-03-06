//Linked List program for inserting a node.

public class LL_4
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
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        
        new_node.next=head;
        head=new_node;
    }
    public void insertAfter(Node prev_node,int new_data)
    {
        if(prev_node==null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node=new Node(new_data);
        
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }
    public void append(int new_data)
    {
        Node new_node=new Node(new_data);
        
        if(head==null)
        {
            head=new Node(new_data);
            return;
        }
        new_node.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
        return;
    }
    public void printList()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String args[])
    {
        LL_4 llist=new LL_4();
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next,8);
        System.out.println("The created linked list is:");
        llist.printList();
    }
}
