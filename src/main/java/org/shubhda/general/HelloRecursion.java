package org.shubhda.general;

public class HelloRecursion {

    public static void main(String[] args) {
        int j = 10;
        testRecursion(j);
    }

    private static int A = 0;


    public static void testRecursion(int i) {
        A++;
        System.out.println("A is : "+ A);
        int x = 0;
        System.out.println("x is : " + x);
        x++;
        i = i - x;
        System.out.println("i is : " + i);
        //System.out.println("A is : " + A);
        if (A < 10)
            testRecursion(i);
    }
}
