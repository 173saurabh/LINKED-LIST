//linked list with three nodes without using inbuilt ll

public class LL_3_NODES
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
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
        LL_3_NODES ll=new LL_3_NODES();
        ll.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        
        ll.head.next=second;
        second.next=third;
        
       ll.printList();
    }
}
