package Stack;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayMinimum {
    private class Pair{
        int first, second;
        Pair(){
            this.first = 0;
            this.second = 0;
        }

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int[] nextSmallerElement(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Pair> st = new Stack<>();
        for(int i = nums.length - 1; i >= 0; --i){
            if(st.isEmpty()){
                ans[i] = nums.length;
                st.push(new Pair(i, nums[i]));
            }else{
                while(st.peek().second >= nums[i]){
                    st.pop();
                    if(st.isEmpty()) break;
                }
                if(st.isEmpty()) {
                    ans[i] = nums.length;
                    st.push(new Pair(i, nums[i]));
                    continue;
                }
                ans[i] = st.peek().first;
                st.push(new Pair(i, nums[i]));
            }
        }
        return ans;
    }

    public int[] prevSmallerEqualElement(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < nums.length; ++i){
            if(st.isEmpty()){
                ans[i] = -1;
                st.push(new Pair(i, nums[i]));
            }else{
                while(st.peek().second > nums[i]){
                    st.pop();
                    if(st.isEmpty()) break;
                }
                if(st.isEmpty()) {
                    ans[i] = -1;
                    st.push(new Pair(i, nums[i]));
                    continue;
                }
                ans[i] = st.peek().first;
                st.push(new Pair(i, nums[i]));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3, 1, 2, 4};
        SumOfSubarrayMinimum ob = new SumOfSubarrayMinimum();
        int[] nse = ob.nextSmallerElement(nums);
        System.out.println("nse: " + Arrays.toString(nse));
        int[] pse = ob.prevSmallerEqualElement(nums);
        System.out.println("pse: " + Arrays.toString(pse));

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int left =  i - pse[i];
            int right = nse[i] - i;

            sum = (sum + (right * left * nums[i]));
        }
        System.out.println(sum);

    }
}
