package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<= n-2; i++){
            int minIndex = i; // Assume current index holds the minimum
            for (int j= i; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if smaller is found
                }
            }
            int temp =arr[minIndex] ;
            arr[minIndex] = arr[i];
            arr[i] =temp;
            }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Before selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        selectionSort(arr);
    }
}
