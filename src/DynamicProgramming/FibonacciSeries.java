package DynamicProgramming;

import java.util.Arrays;

public class FibonacciSeries {
    private int fib1(int n){
        if(n <= 1) return n;
        return fib1(n - 1) + fib1(n - 2);
    }
    private int fib2(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fib2(n - 1, dp) + fib2(n - 2, dp);
    }
    private int fib3(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]= 0;
        dp[1]= 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }

    private int fib4(int n){
        int prev2 = 0;
        int prev = 1;

        for(int i=2; i<=n; i++){
            int cur_i = prev2+ prev;
            prev2 = prev;
            prev= cur_i;
        }
        return prev;

    }
    public static void main(String[] args) {
        FibonacciSeries ob = new FibonacciSeries();
        System.out.println(ob.fib1(4));
        int[] dp = new int[7+1];
        for(int i = 0; i < 8; i++) dp[i] = -1;
        System.out.println(ob.fib2(7, dp));
        System.out.println(ob.fib3(8));
        System.out.println(ob.fib4(8));
    }
}
