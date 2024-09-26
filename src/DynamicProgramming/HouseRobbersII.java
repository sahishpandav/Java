package DynamicProgramming;

import java.util.Arrays;

public class HouseRobbersII {
//    You are a professional robber planning to rob houses along a street.
//    Each house has a certain amount of money stashed.
//    All houses at this place are arranged in a circle.
//    That means the first house is the neighbor of the last one.
//    Meanwhile, adjacent houses have a security system connected,
//    and it will automatically contact the police if two adjacent
//    houses were broken into on the same night.

//    It means that if the given array is {2, 3, 2}
//    then answer should  be 3
//    not 2, 2 = 4 because 1st and last elements are adjacent.

//    what we can do is,
//
    public static int solve(int idx, int[] nums, int[] dp){
        if(idx == 0){
            return nums[idx];
        }
        if(idx < 0){
            return 0;
        }
        if(dp[idx] != -1) return dp[idx];
//      not pick the current house
        int nopick = solve(idx - 1, nums, dp);

//        pick the current element
        int pick = nums[idx] + solve(idx - 2, nums, dp);

        return dp[idx] = Math.max(pick, nopick);
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
//        the output should not be 4 in above case, because the array is circular and 1st and last elements
//        are adjacent elements and robbery in those houses will alert the police
//        so we well generate 2 differnet arrays ,
//        first array which is excluding last element
//        and 2nd array which is excluding 1st element

        int n = nums.length;
        int[] dp = new int[n];
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        for(int i = 0; i < n; i++){
            if(i != 0) arr1[i - 1] = nums[i];
            if(i != n - 1) arr2[i] = nums[i];
        }

//        System.out.println(solve(n-1, nums, dp));
        Arrays.fill(dp, -1);
        int first = solve(n-2, arr1, dp);
        Arrays.fill(dp, -1);
        int second = solve(n - 2, arr2, dp);
        System.out.println(Math.max(first, second));
    }
}
