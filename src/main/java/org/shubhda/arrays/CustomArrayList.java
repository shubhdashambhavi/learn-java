package org.shubhda.arrays;

import java.util.ArrayList;

public class CustomArrayList {

    int n=4;

    // the custom datatype class
    class Data
    {
        // global variables of the class
        int roll;
        String name;
        int marks;
        long phone;

        // constructor has type of data that is required
        Data(int roll, String name, int marks, long phone)
        {
            // initialize the input variable from main
            // function to the global variable of the class
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phone = phone;
        }
    }

    public void addValues(int roll[], String name[], int marks[],
                          long phone[])
    {
        ArrayList<Data> list=new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            list.add(new Data(roll[i], name[i], marks[i],
                    phone[i]));
        }
        printValues(list);
    }

    public void printValues(ArrayList<Data> list)
    {
        for (int i = 0; i < n; i++)
        {
            Data data = list.get(i);

            System.out.println(data.roll+" "+data.name+" "
                    +data.marks+" "+data.phone);
        }
    }

    public static void main(String args[])
    {
        int roll[] = {1, 2, 3, 4};
        String name[] = {"Shubham", "Atul", "Ayush", "Rupesh"};
        int marks[] = {100, 99, 93, 94};
        long phone[] = {8762357381L, 8762357382L, 8762357383L,
                8762357384L
        };

        CustomArrayList custom = new CustomArrayList();
        custom.addValues(roll, name, marks, phone);
    }
}
