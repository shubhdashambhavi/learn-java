package org.shubhda.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AppendTwoArray {

    public static void main(String[] args) {

        // adding two arraylists
        /*ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Geeks");
        ArrayList<String> arrayList2=new ArrayList<String>();
        arrayList2.add("For");
        arrayList2.add("Geeks");
        arrayList1.addAll(arrayList2);
        System.out.println("Combined array: "+arrayList1);*/

        // retaining common elements of both the list
        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Geeks");
        arrayList1.add("and");
        arrayList1.add("For");

        ArrayList<String> arrayList2=new ArrayList<String>();
        arrayList2.add("For");
        arrayList2.add("Geeks");
        arrayList1.retainAll(arrayList2);
        System.out.println("common elements: "+arrayList1);
    }
}
