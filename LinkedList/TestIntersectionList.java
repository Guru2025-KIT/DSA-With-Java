package LinkedList;

class IntersectionPoint{
    ListNode intersection(ListNode head1,ListNode head2){
        //Find Length of 2 Linked Lists.
        int l1=0;
        int l2=0;

        ListNode temp1=head1;
        ListNode temp2=head2;

        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }

        //Calculate Gap.
        int gap=0;
        if(l1>l2){
            gap=l1-l2;
        }else{
            gap=l2-l1;
        }

        //Move pointer of Big LL to overcome the Gap.
        temp1=head1;
        temp2=head2;

        if(l1>l2){
            for(int i=1;i<=gap;i++){
                temp1=temp1.next;
            }
        }else{
            for(int i=1;i<=gap;i++){
                temp2=temp2.next;
            }
        }

        //Now Move both pointers with same speed.
        while(temp2!=null && temp1!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return null;
    }
}

public class TestIntersectionList {
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

        ListNode head2= null;

        ListNode h = new ListNode(8);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(10);
        head2=h;
        h.next=i;
        i.next=j;
        j.next=b;

        Display disp=new Display();
        System.out.println("\nFirst Linked List IS: ");
        disp.display1(head1);
        System.out.println("\nSecond Linked List IS: ");
        disp.display1(head2);

        IntersectionPoint pt=new IntersectionPoint();
        ListNode intersect=pt.intersection(head1,head2);

        if(intersect==null){
            System.out.println("\nThere is No Intersection Point.");
        }else{
            System.out.println("\n\nIntersecting Point is: "+intersect.value);
        }



    }
}
