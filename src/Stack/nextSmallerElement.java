package Stack;

import java.util.Stack;

public class nextSmallerElement {
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

    public int[] solve(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Pair> st = new Stack<>();
        for(int i = nums.length - 1; i >= 0; --i){
            if(st.isEmpty()){
                ans[i] = -1;
                st.push(new Pair(i, nums[i]));
            }else{
                while(st.peek().second >= nums[i]){
                    st.pop();
                    if(st.isEmpty()) break;
                }
                if(st.isEmpty()) {
                    ans[i] = -1;
                    st.push(new Pair(i, nums[i]));
                    continue;
                }
                ans[i] = st.peek().second;
                st.push(new Pair(i, nums[i]));
            }
        }
        return ans;
    }

    public int[] solve2(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < nums.length; ++i){
            if(st.isEmpty()){
                ans[i] = -1;
                st.push(new Pair(i, nums[i]));
            }else{
                while(st.peek().second >= nums[i]){
                    st.pop();
                    if(st.isEmpty()) break;
                }
                if(st.isEmpty()) {
                    ans[i] = -1;
                    st.push(new Pair(i, nums[i]));
                    continue;
                }
                ans[i] = st.peek().second;
                st.push(new Pair(i, nums[i]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 7, 3, 7, 8, 1};
        nextSmallerElement ob = new nextSmallerElement();
        int[] nse = ob.solve(nums);
        for(int num: nse) System.out.print(num+ " ");
        System.out.println();
        int[] pse = ob.solve2(nums);
        for(int num: pse) System.out.print(num+ " ");
    }
}
