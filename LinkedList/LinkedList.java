package LinkedList;

class LinkedList {
    static Node head;
    static int size = 0;

    // Inserts a node at the beginning and returns new head
    Node AddAtHead(Node head, int value) {
        Node temp = new Node(value);
        temp.next = head;
        size++;
        return temp;
    }

    // Inserts a node at the end and returns head
    Node AddAtTail(Node head, int value) {
        Node ptr = new Node(value);

        // If list is empty, new node becomes head
        if (head == null) {
            size++;
            return ptr;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = ptr;
        size++;
        return head;
    }

    // Inserts node at given 1-based position and returns head
    Node InsertAtPosition(Node head, int value, int index) {
        // Valid positions are from 1 to size + 1
        if (index < 1 || index > size + 1) {
            System.out.println("Invalid Position.");
            return head;
        }

        // Insert at head
        if (index == 1) {
            return AddAtHead(head, value);
        }

        Node temp = head;
        Node ptr = new Node(value);

        // Move temp to node just before target position
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }

        ptr.next = temp.next;
        temp.next = ptr;
        size++;
        return head;
    }

    // Deletes first node and returns new head
    Node deleteFromHead(Node head) {
        if (head == null) {
            System.out.println("Empty Linked List. Can't delete the element!");
            return head;
        }

        System.out.println("\nDeleted Item is: " + head.data);
        head = head.next;
        size--;
        return head;
    }

    // Deletes last node and returns head
    Node deleteFromTail(Node head) {
        if (head == null) {
            System.out.println("Empty Linked List. Can't delete the element!");
            return head;
        }

        // If only one node exists
        if (head.next == null) {
            System.out.println("\nDeleted Item is: " + head.data);
            size--;
            return null;
        }

        Node temp = head;
        Node pretemp = null;

        // Move to last node and keep track of previous node
        while (temp.next != null) {
            pretemp = temp;
            temp = temp.next;
        }

        System.out.println("\nDeleted Item is: " + temp.data);
        pretemp.next = null;
        size--;
        return head;
    }

    // Deletes node at given 1-based position and returns head
    Node deletePosition(Node head, int index) {
        if (head == null) {
            System.out.println("No Element to delete");
            return head;
        }

        // Valid positions are from 1 to size
        if (index < 1 || index > size) {
            System.out.println("Invalid Position!");
            return head;
        }

        // Delete first node
        if (index == 1) {
            return deleteFromHead(head);
        }

        Node temp = head;
        Node pretemp = null;

        // Move temp to target node and pretemp to previous node
        for (int i = 1; i < index; i++) {
            pretemp = temp;
            temp = temp.next;
        }

        System.out.println("\nDeleted Item is: " + temp.data);
        pretemp.next = temp.next;
        size--;
        return head;
    }

    // Displays all elements of the linked list
    void display(Node head) {
        if (head == null) {
            System.out.println("Empty Linked List....");
            return;
        }

        System.out.println("Linked List Elements Are:");
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }
}