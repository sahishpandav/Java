package RajaSoftwareLabs;
import java.util.*;

public class A4 {
    public static void main(String[] args) {
//        write a function that takes an array of integer as input and prints the second maximum
//        difference between any two elements from the array.
//        Example: arr[] = {14, 12, 70, 15, 95, 65, 22, 30}
//        first max difference = 95 - 12 = 83
//        second max difference  = 95 - 14 = 81
        int[] arr = {14, 12, 70, 15, 95, 65, 22, 30};
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }


        for(int i = 0; i < arr.length;i++){
            mini = Math.min(mini, arr[i]);

        }

        System.out.println(maxi - mini);
    }
}
