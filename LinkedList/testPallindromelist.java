package LinkedList;

class Pallindrome {
    boolean IsPallindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        MiddleOfLinkedList mid = new MiddleOfLinkedList();
        reverseLinkedList second = new reverseLinkedList();

        // 1. Find the middle
        ListNode middleNode = mid.MiddleOfList(head);

        // 2. Reverse the second half and SAVE the reference
        ListNode reversedSecondHalfHead = second.reverselist(middleNode);
        ListNode tempSecond = reversedSecondHalfHead; // Use this for comparison
        ListNode tempFirst = head;

        boolean isPalin = true;

        // 3. Compare halves
        while (tempSecond != null) {
            if (tempFirst.value != tempSecond.value) {
                isPalin = false;
                break; // Mismatch found
            }
            tempFirst = tempFirst.next;
            tempSecond = tempSecond.next;
        }

        // 4. RESTORE the list (Reverse it back to original)
        second.reverselist(reversedSecondHalfHead);

        return isPalin;
    }
}

public class testPallindromelist {

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
        f.next=g;
        head = a;


        Display display = new Display();

        System.out.println("Linked List is: ");
        display.display1(head);

        Pallindrome palli=new Pallindrome();
        boolean result=palli.IsPallindrome(head);
        if(result) {
            System.out.println("\nGiven List is Pallindrome");
        }else{
            System.out.println("\nGiven List is not a Pallindrome");
        }
    }
}