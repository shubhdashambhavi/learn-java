package org.shubhda.arrays;

import java.util.ArrayList;
import java.util.List;

public class SplitList {

    public static List[] split(List<String> list)
    {
       int size= list.size();
       List<String> first = new ArrayList<>(list.subList(0, (size)/2));
       List<String> second= new ArrayList<>(list.subList((size)/2,size));
       return new List[] {first,second};
    }

    public static void main(String[] args)
    {
        // create an ArrayList
        List<String> list = new ArrayList<String>();

        list.add("Geeks");
        list.add("Practice");
        list.add("Contribute");
        list.add("IDE");
        list.add("Courses");

        // call split method which return List of array
        List[] lists = split(list);

        System.out.println(lists[0]);
        System.out.println(lists[1]);
    }
}
