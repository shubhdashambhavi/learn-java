package org.shubhda.general;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
             data=d;
            next=null;
        }
    }

    public void printList(){
        Node n=head;
        while (n!=null){
            System.out.println("data : " +n.data);
            n=n.next;
        }
    }

    /* Returns count of nodes in linked list */
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Cound of Node:" + count);
        return count;
    }

    //Checks whether the value x is present in linked list
    public boolean search(Node head, int x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }
// Insert new node at the begining of the list

    public void pushFirst(int new_data){
        Node new_node=new Node(new_data);
        if(head == null){
            head= new_node;
            System.out.println("head is null");

        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    //Insert data in the middle of the list
    public void insertInMiddle(Node prev_node,int new_data){
        Node new_node=new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;

    }

    //Insert data in the end of the list
    public void insertInEnd(int new_data){
        Node new_node=new Node(new_data);
        if(head==null){
            head=new_node;
            return;
        }

        new_node.next=null;

        Node n=head;
        //why n.next not n
        while (n.next!=null){
            n=n.next;
        }
        n.next=new_node;
    }
// deleting element
    public void deleteNode(int key){
        /*Node new_node=new Node(key);
        prev_node.next=new_node.next;*/
        Node tmp=head, prev=null;
        // If head node itself holds the key to be deleted
         if(tmp!=null && tmp.data== key){
             head= tmp.next;
             return;
         }

        // If key was not present in linked list
         if(tmp==null)
             return;

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
         while (tmp!=null && tmp.data!=key){
             prev =tmp;
             tmp=tmp.next;
         }

         prev.next=tmp.next;

    }

    public void swapNodes(int x,int y){
        if(x==y)
            return;

        Node prevX=null, currX=head;

        while (currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null, currY=head;
        while (currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;

        //Swap next pointers
         Node temp=currX.next;
         currX.next=currY.next;
         currY.next=temp;

    }

    public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.head= new Node(1);
        Node second = new Node(2);
        Node third =new Node(3);
        llist.head.next=second;
        second.next=third;
        llist.pushFirst(4);
        llist.insertInMiddle(second,5);
        llist.insertInEnd(6);
        llist.deleteNode(5);
        llist.swapNodes(4,3);
        llist.printList();
        llist.getCount();

    }
}
