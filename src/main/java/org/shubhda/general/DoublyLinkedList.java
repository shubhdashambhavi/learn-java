package org.shubhda.general;

public class DoublyLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
        }
    }
//Printing the list
    public void printList(Node n){
        Node last=null;
        System.out.println("Traversal in forward Direction");
        while (n!=null){
            System.out.print(n.data + " ");
            last=n;
            n=n.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    //Insert node in the end
    public void pushEnd(Node given_node,int new_data){
        Node last=null;
        Node new_node=new Node(new_data);
        while (given_node!=null){

            last=given_node;
            given_node=given_node.next;
        }

        if(last.next==null){
            last.next=new_node;
            new_node.prev=last;
            new_node.next=null;
        }
    }

    //adding node at the begining
    public void pushFirst(int new_data){
         /*1. allocate node
           2. put in the data */
        Node new_Node = new Node(new_data);

         //3. Make next of new node as head and previous as NULL
        new_Node.next = head;
        new_Node.prev = null;

         //4. change prev of head node to new node
        if (head != null)
            head.prev = new_Node;

        // 5. move the head to point to the new node
        head = new_Node;
    }

    //Add a node after given node
    public void addAfterNode(Node given_node,int new_data){
        Node new_node=new Node(new_data);
        new_node.prev=given_node;
        new_node.next=given_node.next;
        given_node.next=new_node;

        /* Change previous of new_node's next node */
       if (new_node.next != null)
            new_node.next.prev = new_node;


    }

    // Add a node at the end of the list
    void append(int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        Node new_node = new Node(new_data);

        Node last = head;

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }

    //add a node before given node

    public void addBeforeNode(Node next_node,int new_data){

        if(next_node==null){
            return;
        }

        Node new_node=new Node(new_data);
        new_node.prev=next_node.prev;
        next_node.prev=new_node;
        new_node.next=next_node;

        if(new_node.prev!=null)
            new_node.prev.next=new_node;
        else
            head=new_node;
    }

    void deleteNode(Node head_ref, Node del)
    {

        // Base case
        if (head == null || del == null) {
            return;
        }

        // If node to be deleted is head node
        if (head == del) {
            head = del.next;
        }

        // Change next only if node to be deleted
        // is NOT the last node
        if (del.next != null) {
            del.next.prev = del.prev;
        }

        // Change prev only if node to be deleted
        // is NOT the first node
        if (del.prev != null) {
            del.prev.next = del.next;
        }

        // Finally, free the memory occupied by del
        return;
    }

    public static void main(String[] args) {
        DoublyLinkedList llist=new DoublyLinkedList();
        llist.pushFirst(4);
        llist.pushFirst(5);
        llist.pushFirst(7);
        llist.addAfterNode(llist.head.next,6);
        llist.pushEnd(llist.head,10);
        llist.append(11);
        llist.addBeforeNode(llist.head.next,12);
        llist.printList(llist.head);


    }
}
