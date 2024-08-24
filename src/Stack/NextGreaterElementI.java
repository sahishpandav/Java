package Stack;

import java.util.Stack;

public class NextGreaterElementI {
//    Q1. Find the next greater element in non-circular array.
//    Example 1:
//    Input: N = 11, A[] = {5,7,1,2,6,0}
//    Output: {7,-1,2,6,-1,-1}

//    Q2. Given a circular integer array A, return the next greater
//    element for every element in A. The next greater element
//    for an element x is the first element greater than x that
//    we come across while traversing the array in a clockwise
//    manner. If it doesn't exist, return -1 for this element.
//    Example 1:
//    Input: N = 11, A[] = {3,10,4,2,1,2,6,1,7,2,9}
//    Output: 10,-1,6,6,2,6,7,7,9,9,10
    private static int[] solve2(int[] arr){
        int[] nums = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length - 1; i >= 0; --i) st.push(arr[i]);

        for(int i = arr.length - 1; i >= 0; --i){
            if(st.isEmpty()){
                nums[i] = -1;
                st.push(arr[i]);
                continue;
            }

            while(arr[i] >= st.peek()){
                st.pop();
                if(st.isEmpty()) break;
            }
            if(st.isEmpty()){
                nums[i] = -1;
                st.push(arr[i]);
                continue;
            }
            nums[i] = st.peek();
            st.push(arr[i]);
        }

        return nums;
    }
    private static int[] solve1(int[] arr){
        int[] nums = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length - 1; i >= 0; --i){
            if(st.isEmpty()){
                nums[i] = -1;
                st.push(arr[i]);
                continue;
            }
            while(arr[i] > st.peek()){
                st.pop();
                if(st.isEmpty())break;
            }
            if(st.isEmpty()){
                nums[i] = -1;
                st.push(arr[i]);
                continue;
            }

            nums[i] = st.peek();
            st.push(arr[i]);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,1,2,6,0};
//        int[] nums = solve1(arr);
//        for(int num: nums) System.out.print(num + " ");
//        System.out.println();
        int[] arr2 = {1,2,3,4,3};
        int[] arr3 = {5,4,3,2,1};
        int[] nums2 = solve2(arr3);
        for(int num: nums2) System.out.print(num + " ");
    }
}
