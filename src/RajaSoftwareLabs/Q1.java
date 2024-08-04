package RajaSoftwareLabs;


import java.util.ArrayList;

public class Q1 {
//    Q1. The task is to print a string without any repeating characters.
    public static String funct(String str){
        ArrayList<Character> ls = new ArrayList<>();
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            if(!ls.contains(str.charAt(i))){
                ans += str.charAt(i);
                ls.add(str.charAt(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Helper";

        System.out.println("The string without repeating characters is: " + funct(str));
    }
}
