package Recursion;

import java.util.ArrayList;

public class SubsequenceWithSumKAnyOneSubsequence {
    public static boolean flag = false;
    public static void solve(int idx, int[] nums, ArrayList<Integer> ls, int sum, int target){
        if(idx == nums.length){
            if(sum == target && !flag){
                System.out.println(ls);
                flag = true;
            }
            return;
        }

        sum += nums[idx];
        ls.add(nums[idx]);
        solve(idx + 1, nums, ls, sum, target);

        sum -= nums[idx];
        ls.remove(ls.size() - 1);
        solve(idx + 1, nums, ls, sum, target);

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        ArrayList<Integer> ls = new ArrayList<>();
        int k = 2;
        solve(0, nums, ls, 0, k);
    }
}
