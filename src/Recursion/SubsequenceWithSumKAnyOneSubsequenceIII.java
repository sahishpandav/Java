package Recursion;

import java.util.ArrayList;

public class SubsequenceWithSumKAnyOneSubsequenceIII {
//    here we need to return the number of subsequence which statisfies the sum condition
    public static int solve(int idx, int[] nums, int sum, int target){
        if(idx == nums.length){
            if(sum == target){
                return  1;
            }
            else return 0;
        }

        sum += nums[idx];
        int left = solve(idx + 1, nums, sum, target);

        sum -= nums[idx];
        int right = solve(idx + 1, nums, sum, target);

        return left + right;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        ArrayList<Integer> ls = new ArrayList<>();
        int k = 2;
        System.out.println(solve(0, nums, 0, k));
    }
}
