package Arrays;

import java.util.*;

public class ThreeSumHashing {
//    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
//    such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//    does not contain duplicates
    public static List<List<Integer>> solve(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; ++i){
            HashSet<Integer> st = new HashSet<>();
            for(int j = i+1; j < n; ++j){
                int rem = -nums[i] - nums[j];
                if(st.contains(rem)){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(rem);
//                    this is not required if we have already the array at the first
//                    Collections.sort(ls);
                    ans.add(ls);

                }
                st.add(nums[j]);
            }
        }
        List<List<Integer>> sol = new ArrayList<>();
        for(List<Integer> ls: ans){
            sol.add(ls);
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,1,2,-1,-4};
        int[] nums2 = {0, 0, 0};
        System.out.println(solve(nums1));

    }
}
