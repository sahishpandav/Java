package Recursion;

import java.util.ArrayList;

public class SubsequencesWithSumK {
    public static void solve(int idx, int[] nums, ArrayList<Integer> ls, int sum, int k){
        if(idx == nums.length){
            if(sum == k){
                System.out.println(ls);
            }
            return;
        }

        ls.add(nums[idx]);
        sum += nums[idx];
        solve(idx + 1, nums, ls, sum, k);

        sum -= nums[idx];
        ls.remove(ls.size() - 1);
        solve(idx + 1, nums, ls, sum, k);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        ArrayList<Integer> ls = new ArrayList<>();
        int k = 2;
        solve(0, nums, ls, 0, k);
    }
}
