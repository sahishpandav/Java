package RajaSoftwareLabs;
import java.util.*;
public class A5 {
//    write a function to take an input parameter and prints the number that have remainder 4 when divided by 5
//    i/p: [19, 10, 44, 3, 11, 129]
//    o/p: [19, 44, 129]

    public static void main(String[] args) {

        int[] arr = {19, 10, 44, 3, 11, 129};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 4) System.out.print(arr[i] + " ");
        }
    }

}
