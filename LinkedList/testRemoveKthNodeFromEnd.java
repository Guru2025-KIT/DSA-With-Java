package LinkedList;
import java.util.Scanner;

class RemoveKthNodeFromEnd{

    ListNode removeKthNodeFromEnd(ListNode head,int k){
        ListNode dummy=new ListNode(0,head);
        ListNode slow=dummy;
        ListNode fast=dummy;

        //give hike to fast node first K times.
        for(int i=0;i<=k;i++){
            if(fast==null){
                return dummy.next;
            }
            fast=fast.next;
        }

        //Now Move both at same speed.
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}

public class testRemoveKthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head = null;

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        head = a;


        Display display = new Display();
        RemoveMiddleNode middle=new RemoveMiddleNode();

        System.out.println("Original Linked List Is: ");
        display.display1(head);

        Scanner input=new Scanner(System.in);
        System.out.print("\n\nEnter Value of K: ");
        int k=input.nextInt();

        System.out.println("\nLinked List after Kth node Deletion from End Is: ");
        RemoveKthNodeFromEnd remove=new RemoveKthNodeFromEnd();
        head=remove.removeKthNodeFromEnd(head,k);
        display.display1(head);




    }
}
