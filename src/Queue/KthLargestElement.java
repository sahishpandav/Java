package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
//    Given an integer array nums and an integer k, return the kth largest element in the array.
//    Note that it is the kth largest element in the sorted order, not the kth distinct element.
//    Can you solve it without sorting?

//    Example 1:
//    Input: nums = [3,2,1,5,6,4], k = 2
//    Output: 5

//    Example 2:
//    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//    Output: 4
    public static int solve(int[] nums, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums) q.offer(num);
        for(int i = 0; i < k - 1; i++){
            q.poll();
        }
        return q.poll();
    }
    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println(solve(nums1, k1));
    }
}
