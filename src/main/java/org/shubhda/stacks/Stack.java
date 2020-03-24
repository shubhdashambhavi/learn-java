package org.shubhda.stacks;

public class Stack {

    static final int MAX= 1000;
    int top;
    int a[]=new int[MAX];

    Stack(){
        top = -1;
    }
    boolean isEmpty(){
        return (top<0);
    }

    boolean push(int x){
        if(top>=MAX-1){
            System.out.println("Stack overflow");
            return false;
        }else{
            a[++top]=x;
            System.out.println(x +" pushed into stack");
            return true;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x= a[top--];
            return x;
        }
    }

    int peek(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x=a[top];
            return x;
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.peek() + " peek of stack");
    }
}
