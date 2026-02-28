package IJPInterviews;

public class FindMaxMin {

    public static int[] findMaxMin (int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[0] > arr[i]) {
                max = arr[i];
            }
            if (arr[0] < arr[i]) {
                min = arr[i];

            }
        }
        return new int[] {min,max};
    }

    public static int secondLargest (int []arr){
        int secondLargest = arr[0];
        int firstLargest = arr[0];
        for (int i =0; i <= arr.length-1 ; i++){
            if (arr[i]>arr[0]){
                firstLargest = arr[i];
            }
            secondLargest = firstLargest;
            if (firstLargest<arr[i] ){
            }
        }
        return secondLargest;
    };
        public static void main (String[] args){
        int [] array = {1,2,3,4,5};
        int [] result = findMaxMin(array);
            System.out.println("min = " + result[0]);
            System.out.println("max = " + result[1]);
        int value = secondLargest(array);
    }
}
