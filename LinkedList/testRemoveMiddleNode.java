package LinkedList;

class RemoveMiddleNode {

    ListNode removeNodeFromMiddle(ListNode head){
        ListNode dummy=new ListNode(0,head);
        ListNode slow=dummy;
        ListNode fast=dummy;

        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next= slow.next.next;
        return dummy.next;
    }

}
public class testRemoveMiddleNode{

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

        System.out.println("\nLinked List after middle Deletion Is: ");
        head=middle.removeNodeFromMiddle(head);
        display.display1(head);



    }
}