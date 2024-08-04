package Recursion2;

import java.util.ArrayList;
import java.util.List;

//    Given an array nums of distinct integers,
//    return all the possible permutations. You can
//    return the answer in any order.
//
//    Input: nums = [1,2,3]
//    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//    Example 2:
//
//    Input: nums = [0,1]
//    Output: [[0,1],[1,0]]
//    Example 3:
//
//    Input: nums = [1]
//    Output: [[1]]
public class Permutations {
    public static void solve(int[] nums, List<Integer> ls, boolean[] map, List<List<Integer>> ans){
        if(ls.size() == nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!map[i]){
                ls.add(nums[i]);
                map[i] = true;
                solve(nums, ls, map, ans);

                ls.remove(ls.size() - 1);
                map[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        List<Integer> ls = new ArrayList<>();
        solve(nums, ls, map, ans);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
}
