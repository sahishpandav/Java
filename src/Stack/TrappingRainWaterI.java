package Stack;
//
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//
//
//
//        Example 1:
//
//
//        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        Output: 6
//        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//        Example 2:
//
//        Input: height = [4,2,0,3,2,5]
//        Output: 9
public class TrappingRainWaterI {
    public static int trap(int[] height) {
        int n = height.length;
        int[] p = new int[n];
        int[] s = new int[n];
        int currMax = height[0];
        for(int i = 1; i < n; ++i){
            p[i] = currMax;
            if(height[i] > currMax){
                currMax = height[i];
            }
        }

        currMax = height[n-1];
        for(int i = n-2; i >= 0; --i){
            s[i] = currMax;
            if(height[i] > currMax){
                currMax = height[i];
            }
        }

        int ans = 0, curr = 0;
        for(int i = 0; i < n; ++i){
            curr = Math.min(p[i], s[i]) - height[i];
            if(curr > 0){
                ans += curr;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2));
    }
}
