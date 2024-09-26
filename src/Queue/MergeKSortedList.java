package Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedList {
//    Given k sorted arrays arranged in the form of a matrix of size k * k.
//    The task is to merge them into one sorted array.
//    Return the merged sorted array ( as a pointer to the merged sorted arrays in cpp,
//    as an ArrayList in java, and list in python).

//    Input: k = 3, arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
//    Output: 1 2 3 4 5 6 7 8 9

//    Input: k = 4, arr[][]={{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}}
//    Output: 1 2 2 2 3 3 4 4 5 5 6 6 7 8 9 9
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        // Write your code here.
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                q.offer(arr[i][j]);
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        while(!q.isEmpty()) ls.add(q.poll());
        return ls;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};
        System.out.println(mergeKArrays(nums, nums.length));
    }
}
