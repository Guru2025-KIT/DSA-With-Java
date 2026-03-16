package LinkedList;

class sortLists{
    ListNode SortedList(ListNode head1,ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(temp1!=null && temp2!=null){
            if(temp1.value<temp2.value){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }

        if(temp1!=null){
            temp.next=temp1;
        }else{
            temp.next=temp2;
        }
        return dummy.next;
    }
}

public class testMerge2SortedLists {
    public static void main(String[] args) {
        ListNode head1 = null;

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(9);
        ListNode e = new ListNode(10);
        ListNode f = new ListNode(13);
        ListNode g = new ListNode(24);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        head1 = a;

        ListNode head2 = null;

        ListNode i = new ListNode(4);
        ListNode j = new ListNode(6);
        ListNode k = new ListNode(11);
        ListNode l = new ListNode(34);

        i.next=j;
        j.next=k;
        k.next=l;
        head2=i;


        Display disp=new Display();
        System.out.println("\nFirst Linked List IS: ");
        disp.display1(head1);


        System.out.println("\n\nSecond Linked List IS: ");
        disp.display1(head2);

        sortLists sort=new sortLists();
        ListNode sorting=sort.SortedList(head1,head2);
        System.out.println("\n\nSorted Linked List IS: ");
        disp.display1(sorting);

    }
}
