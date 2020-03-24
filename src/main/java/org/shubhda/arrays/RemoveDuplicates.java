package org.shubhda.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    // Generic way of removing duplicates
    /*public static  <T> ArrayList<T> removeDuplicateValue(ArrayList<T> list1){
        ArrayList<T> finalList=new ArrayList<>();
        for(T m:list1){
            if(!finalList.contains(m)){
                finalList.add(m);
            }
        }
        return finalList;
    }*/

    // Using LinkedHashSet

    /* static <T> ArrayList<T> removeDuplicateValue(ArrayList<T> list1){
        ArrayList<T> finalList= new ArrayList<>();
        LinkedHashSet<T> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.addAll(list1);

        finalList.addAll(linkedHashSet);
        return finalList;
    }*/

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,1,1,13,5,5,5,5,2,4,3,7));

        System.out.println("duplicate list: "+list);
       // ArrayList<Integer> newList=removeDuplicateValue(list);
        // Using distict() of Stream API in JAVA 8
        List<Integer> newList= list.stream().distinct().collect(Collectors.toList());

        System.out.println("New List: "+ newList);

    }
}
