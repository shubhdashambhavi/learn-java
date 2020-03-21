package org.shubhda.general;

public class Factorial {

    public static void main(String[] args) {
        // Find factorial for n = 7
        int n = 4;
        int init = 1;
        int i = 0;
        int j = 7;
//        fibonacci(i, j);
//        factorialAlt1(init, n);
        int result = factorialAlt2(n);
        System.out.println("factorial of n[" + n + "] is : " + result);
    }

    private static int A = 1;

    public static void fibonacci(int incNumb, int factNumber) {

        A = A * (factNumber - incNumb);
        System.out.println("A is : " + A);
        incNumb++;
        System.out.println("incNumb i : " + incNumb);
        if (incNumb < factNumber)
            fibonacci(incNumb, factNumber);
    }

    public static void factorialAlt1(int result, int currentMultiplier) {
        if (currentMultiplier != 1)
            factorialAlt1(currentMultiplier * result, --currentMultiplier);
        else
            System.out.println("factorial is : " + result);
    }

    public static int factorialAlt2(int curentMultiplier) {
        if (curentMultiplier != 1)
            return curentMultiplier * factorialAlt2(--curentMultiplier);
        else
            return 1;
    }
}
