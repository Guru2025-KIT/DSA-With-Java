package LinkedList;

class SwapNodepairs{
    ListNode SwapPairs(ListNode head){
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;

        while(prev.next!=null && prev.next.next!=null){
            ListNode first=prev.next;
            ListNode second=first.next;

            first.next=second.next;
            second.next=first;

            prev.next=second;
            prev=first;
        }
        return dummy.next;
    }
}
public class TestSwapNodesPairs {
    public static void main(String[] args) {
        ListNode head1 = null;

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        head1 = a;

        Display disp=new Display();
        System.out.println("\nOriginal Linked List IS: ");
        disp.display1(head1);

        SwapNodepairs swap=new SwapNodepairs();
        head1=swap.SwapPairs(head1);

        System.out.println("\n\nAfter Swap Linked List IS: ");
        disp.display1(head1);


    }
}
