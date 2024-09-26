package Recursion;
import java.util.ArrayList;

public class SubsequenceWithSumKAnyOneSubsequenceII {
    public static boolean solve(int idx, int[] nums, ArrayList<Integer> ls, int sum, int target){
        if(idx == nums.length){
//          condition satisfied
            if(sum == target){
                System.out.println(ls);
                return true;
            }
//          condition not satisfied
            else return false;
        }

        sum += nums[idx];
        ls.add(nums[idx]);
//        if the condition is satisfied at any point in the code we dont need to do further recursion calls.
        if(solve(idx + 1, nums, ls, sum, target)) return true;

        sum -= nums[idx];
        ls.remove(ls.size() - 1);
        if(solve(idx + 1, nums, ls, sum, target)) return true;

//        if both the recursion fails then return false;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        ArrayList<Integer> ls = new ArrayList<>();
        int k = 2;
        solve(0, nums, ls, 0, k);
    }
}
