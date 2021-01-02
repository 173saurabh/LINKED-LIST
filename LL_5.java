//Linked List(Deleting a node)..........

public class LL_5
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
    public void deleteNode(int key)
    {
        Node prev_node=null;
        Node n=head;
        if(n!=null && n.data==key)
        {
            head=n.next;
            return;
        }
        while(n!=null && n.data!=key)
        {
            prev_node=n;
            n=n.next;
        }
        if(n==null)
        {
            return;
        }
        prev_node.next=n.next;
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
        LL_5 obj=new LL_5();
        
        obj.push(7);
        obj.push(1);
        obj.push(3);
        obj.push(2);
        System.out.println("The linked list created is:");
        obj.printList();
        
        obj.deleteNode(1);
        System.out.println("The updated linked list is:");
        obj.printList();
    }
}
