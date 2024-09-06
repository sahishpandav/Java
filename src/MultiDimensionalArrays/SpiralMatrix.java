package MultiDimensionalArrays;

import java.util.*;

public class SpiralMatrix {
    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int total = rows*cols;
        int top = 0, left = 0, right = cols - 1, bottom = rows - 1;
        int cnt = 0;

        while(cnt < total){

//            traverse from left to right

            for(int i = left; cnt < total && i <= right; i++){
                ans.add(matrix[top][i]);
                cnt++;

            }
            top++;

//            traverse from top to bottom
            for(int i = top; i <= bottom && cnt < total; i++){
                ans.add(matrix[i][right]);
                cnt++;
            }
            right--;

//            traverse from right to left
            for(int i = right; i >= left && cnt <total ; i--){

                ans.add(matrix[bottom][i]);
                cnt++;
            }
            bottom--;

//            traverse from bottom to top
            for(int i = bottom; i >= top && cnt <total; i--){
                ans.add(matrix[i][left]);
                cnt++;
            }
            left++;

        }
        return ans;

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans = spiralOrder(matrix2);
        System.out.println(ans);
    }
}
