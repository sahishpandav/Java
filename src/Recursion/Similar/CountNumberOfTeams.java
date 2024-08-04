package Recursion.Similar;
// There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
//
// You have to form a team of 3 soldiers amongst them under the following rules:
// Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
// A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k])
// where (0 <= i < j < k < n).
//// Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).
//Example 1:
//
//Input: rating = [2,5,3,4,1]
//Output: 3
//Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).


//Example 2:
//
//Input: rating = [2,1,3]
//Output: 0
//Explanation: We can't form any team given the conditions.


//Example 3:
//
//Input: rating = [1,2,3,4]
//Output: 4

import java.util.ArrayList;

public class CountNumberOfTeams {
    public static int count = 0;
    public static void solve(int idx, int[] nums, ArrayList<Integer> ls){
        if(idx == nums.length){
            if(ls.size() == 3){
                if(ls.get(0) > ls.get(1) && ls.get(1) > ls.get(2)){
                    count ++;
                }else if(ls.get(0) < ls.get(1) && ls.get(1) < ls.get(2)) {
                    count++;
                }
            }
            return;
        }
        ls.add(nums[idx]);
        solve(idx + 1, nums, ls);

        ls.remove(ls.size() - 1);
        solve(idx + 1, nums, ls);
    }
    public static void main(String[] args) {
        int[] nums = {2,5,3,4,1};
        int[] nums2 = {2,1,3};
        int[] nums3 = {1,2,3,4};
        int[] nums4 = {89,61,13,36,37,39,97,76,84,18,12,24,71,33,44,85,70,82,15,74,35,66,59,8,3,96,30,16,41,7,10,68,92,83,95,77,9,14,81,88,38};
        solve(0, nums, new ArrayList<>());
        System.out.println(count);

    }
}
