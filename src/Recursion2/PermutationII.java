package Recursion2;

import java.util.ArrayList;
import java.util.List;

public class PermutationII {
    private static void solve(int idx, int[] nums, List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> ls = new ArrayList<>();
            for(int n: nums) ls.add(n);
            ans.add(ls);
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(i, idx, nums);
            solve(idx + 1, nums, ans);
            swap(i, idx, nums);
        }
    }

    private static void swap(int i, int idx, int[] nums){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, ans);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
}
