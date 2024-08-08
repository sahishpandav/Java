package TwoPointers;

public class LongestRepeatingCharacterReplacement {
//    You are given a string s and an integer k.
//    You can choose any character of the string and change it to any other uppercase English character.
//    You can perform this operation at most k times.
//
//    Return the length of the longest substring containing the same
//    letter you can get after performing the above operations.

//    Example 1:
//
//    Input: s = "ABAB", k = 2
//    Output: 4
//    Explanation: Replace the two 'A's with two 'B's or vice versa.
//    Example 2:
//
//    Input: s = "AABABBA", k = 1
//    Output: 4
//    Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//    The substring "BBBB" has the longest repeating letters, which is 4.
//    There may exists other ways to achieve this answer too.
    private static int solve(String s, int k){
        int maxLen = 0;
        for(int i = 0; i < s.length(); ++i){
            int[] hash = new int[26];
            int maxFreq = 0, changes = 0, len = 0;
            for(int j = i; j < s.length(); ++j){
                hash[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);
                len = (j - i + 1);
                changes = len - maxFreq;
//                System.out.println(s.substring(i, j+1));
                if(changes <= k) maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
//        we can modify this question to finding the maximum length of the substring which has atmost
//        k different elements.
        String  s = "AABABBA";
        int k = 1;
        int ans = solve(s, k);

        System.out.println(ans);
    }
}
