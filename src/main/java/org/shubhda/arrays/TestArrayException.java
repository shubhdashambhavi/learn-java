package org.shubhda.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayException {

    public static void main(String[] args) {
        //int ar[] = {1, 2, 3, 4, 5};
        /*for (int i=0; i<=ar.length; i++)
            System.out.println(ar[i]);*/

        // this approach will not give arrayIndexOutOfBound exception unlike above for loop
        /*for(int m:ar){
            System.out.println(m);
        }*/
//..................................................................................................................
      //Arrays vs ArrayList
        // Need to specify the size for array
       /* int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // We cannot add more elements to array arr[]

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        // We can add more elements to arrL

        System.out.println(arrL);
        System.out.println(Arrays.toString(arr));
*/

       /*-----------------------------------------------------------*/

       /* TestArrayException[] array1 = new TestArrayException[3];

        // not allowed (Uncommenting below line causes
        // compiler error)
        // ArrayList<char> arrL = new ArrayList<char>(); (Type arguement cannot be of primitive type

        // Allowed
        ArrayList<Integer> arrL1 = new ArrayList<>();
        ArrayList<String> arrL2 = new ArrayList<>();
        ArrayList<Object> arrL3 = new ArrayList<>();

        ................................................................ */

        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        /*Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        for (Integer x : arr)
            System.out.print(x + " ");
*/
        Object[] arr = al.toArray();
        for (Object x : arr)
            System.out.print(x + " ");


    }

}
