package org.shubhda.general;

public class CircularLinkedList {

     static class Node{
         int data;
         Node next;
    }

    static void printList(Node head)
    {
        Node temp = head;
        if (head != null)
        {
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    static Node push(Node head_ref,int new_data){
         Node temp=head_ref;
         Node ptr=new Node();
         ptr.data = new_data;
         ptr.next=head_ref;

         /* If linked list is not null
        then set the next of last node */
        if (head_ref != null)
        {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr;
        }
        else
            ptr.next = ptr;

        head_ref = ptr;

        return head_ref;
    }

    // Driver Code
    public static void main(String args[])
    {
        /* Initialize lists as empty */
        Node head = null;

    /* Created linked list will
       be 11.2.56.12 */
        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);

        System.out.println("Contents of Circular " +
                "Linked List:");
        printList(head);
    }
}
