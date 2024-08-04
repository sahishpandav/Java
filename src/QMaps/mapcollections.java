package QMaps;
import java.util.HashMap;


public class mapcollections {
    public static void main(String[] args) {
        HashMap<Character, Integer> mp = new HashMap<>();
        String str = "abcdaefghk";

        int first = 0, last = 0, cnt = 0;
        while(last < str.length()){
            char curr = str.charAt(last);
            if(mp.containsKey(curr) && (mp.get(curr) >= first)){
                first = mp.get(curr) + 1;
            }
            mp.put(curr, last);
            cnt = Math.max(cnt, last - first + 1);
            last++;
        }
        System.out.println(cnt);
    }

}
