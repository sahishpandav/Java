package PowerSet;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;

public class Subsets {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("All possible subsequences are: ");
        System.out.print("{");
//        using bit manipulation
        for(int i = 0; i < (1 << s.length()); i++){
            String subString = "";
            for(int j = 0; j < s.length(); j++){
                if((i & (1 << j)) != 0){
                    subString += s.charAt(j);
                }
            }
            System.out.print(", " + subString);
        }
        System.out.println("}");
    }
}
