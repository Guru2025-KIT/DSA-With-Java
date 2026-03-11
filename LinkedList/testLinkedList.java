package LinkedList;

import java.util.Scanner;

public class testLinkedList {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        int value=0;
        int choice=0;
        Scanner input=new Scanner(System.in);
        do{
            try{
                System.out.println("\n---------- Menu --------");
                System.out.println("1.Insert At head.");
                System.out.println("2.Insert at Tail.");
                System.out.println("3.Insert at Position.");
                System.out.println("4.Delete from head.");
                System.out.println("5.Delete From Tail.");
                System.out.println("6.Delete Specific Position.");
                System.out.println("7.Display");
                System.out.println("8. Exit");

                System.out.print("\nEnter Your Choice:");
                choice=input.nextInt();

                switch (choice){
                    case 1:
                        System.out.print("\nEnter Value To insert:");
                        value=input.nextInt();
                        LinkedList.head=ll.AddAtHead(LinkedList.head,value);
                        break;

                    case 2:
                        System.out.print("\nEnter Value To insert:");
                        value=input.nextInt();
                        LinkedList.head=ll.AddAtTail(LinkedList.head,value);
                        break;

                    case 3:
                        System.out.print("\nEnter Index To insert:");
                        int index=input.nextInt();
                        System.out.print("\nEnter Value To insert:");
                        value=input.nextInt();
                        LinkedList.head=ll.InsertAtPosition(LinkedList.head,value,index);
                        break;

                    case 4:
                        LinkedList.head=ll.deleteFromHead(LinkedList.head);
                        break;

                    case 5:
                        LinkedList.head=ll.deleteFromTail(LinkedList.head);
                        break;

                    case 6:
                        System.out.println("\nEnter Index To Delete:");
                        index=input.nextInt();
                        LinkedList.head=ll.deletePosition(LinkedList.head,index);
                        break;

                    case 7:
                        ll.display(LinkedList.head);
                        break;

                    case 8:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Choice Please Try Again!");

                }

            }catch(Throwable e){
                System.out.println("Error: "+e.getMessage());
            }
        }while(choice!=8);

        System.out.println("\nFinal Size of Linked List is: "+LinkedList.size);

        input.close();
    }
}
