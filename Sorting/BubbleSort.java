import java.util.*;

public class bubbleSort {
        public static void main(String args[]){
        int[] arr = {7, 8, 5, 2, 1};
        // loop runs n - 1 times in bubble sort
        for(int i = 0; i < arr.length - 1; ++i){
            for(int j = 0; j < arr.length - i - 1; ++j){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int nums: arr){
            System.out.print(nums + " ");
        }

    }

}
