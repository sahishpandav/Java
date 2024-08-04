package Recursion2;

import java.util.*;

//
//Given a collection of candidate numbers (candidates)
//and a target number (target), find all unique combinations
// in candidates where the candidate numbers sum to target.
//
//Each number in candidates may only be used once in the combination.
//Note: The solution set must not contain duplicate combinations.
//
//Example 1:
//
//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]
//Example 2:
//
//Input: candidates = [2,5,2,1,2], target = 5
//Output:
//[
//[1,2,2],
//[5]
//]
public class CombinationSumII {
    public static void findCombinationsII(int idx, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ls, int target, int[] nums) {
        if (target == 0) {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            if( i > idx && nums[i] == nums[i - 1]) continue;
            if(nums[i] > target) break;
            ls.add(nums[i]);
            findCombinationsII(i + 1, ans, ls, target- nums[i], nums);
            ls.remove(ls.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinationsII(0, ans, ls, target, candidates);
        System.out.println(ans);
    }
}
