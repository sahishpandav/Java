package Recursion2;

import java.util.ArrayList;
import java.util.List;

public class PermutationIII {
        public static void solve(int idx, int[] nums, List<List<Integer>> ans){
            if(idx == nums.length){
                List<Integer> ls = new ArrayList<>();
                for(int num: nums) ls.add(num);
                if(!ans.contains(ls))ans.add(ls);
                return;
            }
            for(int i = idx; i < nums.length; i++){
                if( i > idx && nums[i] == nums[i - 1]) continue;
                swap(i, idx, nums);
                solve(idx + 1, nums, ans);
                swap(i, idx, nums);
            }
        }

        public static void swap(int i, int idx, int[] nums){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
    public static void main(String[] args) {
//        int[] nums = {1, 2, 1, 2, 3, 4, 3};
        int[] nums = {1,1,2};
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, ans);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
}
