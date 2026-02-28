package Sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i= n-1; i>0 ; i--){
            for (int j=0; j<=i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main (String[] args){
//        int[] arr = {13, 46, 24, 52, 20, 9};
        int[] arr = {55,87,90,45,21,30,44,33,86};
        System.out.println("Before selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(arr);
    }
}
