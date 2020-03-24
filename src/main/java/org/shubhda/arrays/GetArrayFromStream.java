package org.shubhda.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetArrayFromStream {

    //Using Collectors.toList() method:
  /*  public static <T> ArrayList<T> convertArrayList(Stream<T> stream){
        List<T> list=stream.collect(Collectors.toList());
        ArrayList<T> finalList= new ArrayList<>(list);
        return finalList;
    }*/
//Collectors.toCollection() method:
    public static <T> ArrayList<T> convertArrayList(Stream<T> stream){

        ArrayList<T> finalList= stream.collect(Collectors.toCollection(ArrayList::new));
        return finalList;
    }


    public static void main(String[] args) {
        Stream<Integer> stream= Stream.of(1,2,3,4,5);
        ArrayList<Integer> newList=convertArrayList(stream);
        System.out.println("Print arrayList: "+newList);

        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("G");
        linkedList.add("e");
        linkedList.add("e");
        linkedList.add("k");
        linkedList.add("s");
        //Convert LinkedList to Array
        Object[] obj=linkedList.toArray();
        //Convert object to String array
        String[] strarray=Arrays.copyOf(obj,obj.length,String[].class);
        System.out.println("LinkedList to String Array: " +Arrays.toString(strarray));

    }
}
