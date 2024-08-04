package RajaSoftwareLabs;

public class anagrams {
    public static boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        int cnt1 = 0;
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++){
            int ascii = s.charAt(i) - 97;
            map[ascii]++;
        }

        for(int i = 0; i < t.length(); i++){
            int ascii = t.charAt(i) - 97;
            map[ascii]--;
        }
        for(int cnt: map){
            // System.out.print(cnt + " ");
            if(cnt > 0) cnt1 += cnt;
        }
        if(cnt1 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String m = "rat", n = "car";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram(n, m));
    }
}
