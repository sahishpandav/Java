package MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class takingRowwiseInputIn2DArray {
    public static void main(String[] args) {
        int n = 2, m = 3;
        int[][] arr = new int[n][m];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                System.out.println("A[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; ++i){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
