package org.shubhda.arrays;

import java.util.ArrayList;

public class ShiftingArray {

    void shiftArray(int arr[],int d, int n){

        for(int i=0;i<d;i++)
            moveByone(arr,n);
    }

    void moveByone(int arr[],int n){
        int temp,i;
        temp=arr[0];
        for (i=0;i<n-1;i++)
            arr[i]=arr[i+1];
        arr[i]=temp;
    }

    void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        ShiftingArray shiftingArray=new ShiftingArray();
        int arr[]={1,2,3,4,5,6,7};
        shiftingArray.shiftArray(arr,3,arr.length);
        shiftingArray.printArray(arr,arr.length);
    }
}
