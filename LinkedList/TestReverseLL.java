package LinkedList;
class ListNode{
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

class reverseLinkedList {
    ListNode reverselist(ListNode head){

        ListNode prev=null;
        ListNode temp=head;

    //Reverse the list Inplace.
        while(temp!=null){
            ListNode nextTemp=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextTemp;
        }

        return prev;    //prev becomes head of reversed list.
    }


}

class Display{
    public  void display1(ListNode head){
        ListNode temp=head;
        if(head==null){
            System.out.println("Empty Linked List.");
        }

        while(temp!=null){
            System.out.printf("%d ",temp.value);
            temp=temp.next;
        }
    }
}
public class TestReverseLL{
    public static void main(String[] args) {
        ListNode head=null;

        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);

        a.next=b;   b.next=c;   c.next=d;   d.next=e;   e.next=f;
        head=a;


        Display display=new Display();

        System.out.print("\nOriginal Linked List:\n");
        display.display1(head);

        reverseLinkedList processor=new reverseLinkedList();

        ListNode reversedListHead=processor.reverselist(head);
        System.out.println("\nReversed Linked List:");
        display.display1(reversedListHead);


    }

}
