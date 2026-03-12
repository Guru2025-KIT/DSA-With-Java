package LinkedList;

class MiddleOfLinkedList{
    ListNode MiddleOfList(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}

public class TestMiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head=null;

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(7);


        a.next=b;   b.next=c;   c.next=d;   d.next=e;   e.next=f;   f.next=g;
        head=a;

        Display disp=new Display();
        System.out.println("Linked List Is: ");
        disp.display1(head);

        MiddleOfLinkedList ll=new MiddleOfLinkedList();
        ListNode middle=ll.MiddleOfList(head);
        System.out.println("\nMiddle Element in the Linked List is: "+middle.value);






    }

}
