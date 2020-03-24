package org.shubhda.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Immutable {

    public static void main(String[] args) throws Exception{
        try {
            List<Character> arrayList = new ArrayList<Character>();
            arrayList.add('X');
            arrayList.add('Y');
            arrayList.add('Z');

            System.out.println("Initial List : " + arrayList);
            List<Character> immutablelist = Collections.unmodifiableList(arrayList);
            System.out.println("Immutable list: " + immutablelist);
            immutablelist.add('A');
        }catch (UnsupportedOperationException e){
            System.out.println("Exception thrown : "+e);
        }
    }
}
