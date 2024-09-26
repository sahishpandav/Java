package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseRobbers {
    private static void printAll(int idx, ArrayList<Integer> ls, int[] arr){
        if(idx == 0){
            ls.add(arr[idx]);
            System.out.println(new ArrayList<>(ls));
            ls.remove(ls.size()-1);
            return;
        }
        if(idx < 0){
            System.out.println(new ArrayList<>(ls));
            return;
        }

        //        pick condition
        ls.add(arr[idx]);
        printAll(idx-2, ls, arr);
        ls.remove(ls.size()-1);

        //        no pick condition
        printAll(idx-1, ls, arr);
    }

    private static int printAllSum(int idx, int[] arr){
        if(idx == 0){
//            sum+= arr[idx];
//            System.out.println(sum);
            return arr[idx];
        }
        if(idx < 0){
//            System.out.println(sum);
            return 0;
        }

        //        pick condition
//        sum += arr[idx];
        int pick = arr[idx] + printAllSum(idx-2, arr);
//        sum -= arr[idx];

        //        no pick condition
        int nopick = 0 + printAllSum(idx-1, arr);

        return Math.max(pick, nopick);
    }

//    memoization approach
    private static int solve(int idx, int[] nums, int[] dp){
        if(idx == 0){
            return nums[idx];
        }
        if(idx < 0){
            return 0;
        }

        if(dp[idx] != -1) return dp[idx];

        // pick condition
        int pick = nums[idx] + solve(idx - 2, nums, dp);

        // not pick
        int nopick = 0 + solve(idx - 1, nums, dp);

        return dp[idx] = Math.max(pick, nopick);
    }
    public static void main(String args[]) {
        // Input array with elements.
        int[] arr = {1, 2, 3, 4};

        // Get the length of the array.
        int n = arr.length;

//         printing all the possible robberies that we can do using recursion
        ArrayList<Integer> ls = new ArrayList<>();
        int idx = n;
//        printAll(idx-1, ls, arr);

//        System.out.println(printAllSum(idx-1, arr));
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(solve(arr.length - 1, arr, dp));

    }
}
