package org.shubhda.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertIterator {

    public static <T> List<T> convertIteratorToList(Iterator<T> iterator){
        List<T> list= new ArrayList<>();
        //add each element of iterator to the list
        iterator.forEachRemaining(list::add);
        return list;
    }
    public static void main(String[] args) {
        Iterator<Integer> iterator= Arrays.asList(1,2,3,4,5).iterator();

        List<Integer> list=convertIteratorToList(iterator);
        System.out.println("List from iteretor: "+ list);

    }
}
