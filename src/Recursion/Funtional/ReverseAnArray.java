package Recursion.Funtional;

import java.util.Arrays;

public class ReverseAnArray {
//    public static int [] reverseUsingRecursion (int i, int j, int [] arr){
//        if (i>=j) return arr;
//
//        int temp = arr[i];
//        arr[i] = arr[j] ;
//        arr[j] = temp;
//
//        reverseUsingRecursion(i+1, j-1, arr);
//        return arr;
//    }
    public static int[] reverseUsingSinglePointer (int i , int[]arr){
        if (i>=arr.length/2) return arr;

        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i]= temp;

        reverseUsingSinglePointer(i+1, arr);
        return arr;

    }

    public static void main (String [] args){
        int[] arr = {2,3,6,8,9,12};
//        reverseUsingRecursion(0, arr.length-1, arr);
        reverseUsingSinglePointer(0, arr);
        System.out.println(Arrays.toString(arr));
    }
}

