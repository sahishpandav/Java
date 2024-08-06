package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class Substrings {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        ArrayList<String> ls = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        ls.add(" ");
        for(int i = 0; i < str.length(); ++i) {
            sb = new StringBuilder();
            for (int j = i; j < str.length(); ++j) {
                sb.append(str.charAt(j));
                ls.add(sb.toString());
            }
        }
        for(String s: ls) System.out.println('"' + s + '"');

    }
}
