import java.util.ArrayList;

public class findMinMax {

    public static ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0 ; i<=arr.length-1; i++){
            if (min>arr[i]){
                min = arr[i];
            }else  if ( max<arr[i]){
                max = arr[i];
            }
        }
        ArrayList <Integer> newArr = new ArrayList<>();
        newArr.add(min);
        newArr.add(max);
        return newArr;
    }

    public static void main (String [] args){
    
        int [] arr = {1, 4, 3, 5, 4, 8, 6};
        System.out.println(getMinMax(arr));
    }
}
