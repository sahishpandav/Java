package Stack;

import java.util.Arrays;
import java.util.Stack;

public class AestroidCollision {
    public static void main(String[] args) {
//        int[] nums = {4, 7, 1, 1, 2, -3, -7, 17, 15, -16};
        int[] nums = {-2,-1,1,2};
        Stack<Integer> st = new Stack<>();
        int idx = 0;
        while (idx < nums.length){
            if(st.isEmpty()){
                st.push(nums[idx]);
            }else if(nums[idx] > 0){
                st.push(nums[idx]);
            }else{
                if(st.peek() < 0){
                    st.push(nums[idx]);
                    ++idx;
                    continue;
                }else if(st.peek() < Math.abs(nums[idx])){
                    st.pop();
                    continue;
                }else if(st.peek() == Math.abs(nums[idx])) {
                    st.pop();
                }
            }
            ++idx;
        }
        int[] arr = new int[st.size()];
        for(int i = arr.length - 1; i >= 0; --i){
            arr[i] = st.pop();
        }
        System.out.println(Arrays.toString(arr));

    }
}
