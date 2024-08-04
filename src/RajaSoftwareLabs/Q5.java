package RajaSoftwareLabs;

public class Q5 {
//    reverse the words from the string

    public static String specialReverse(String str){
        StringBuilder temp = new StringBuilder();
        StringBuilder newString = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            
        }
        newString.append(temp);
        return newString.toString();
    }
    public static String helper(String str){
        String ans = "";
        int f = 0, l = str.length() - 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(f) == ' '){
                f++;
            }
            if(str.charAt(l) == ' '){
                l--;
            }
            if(str.charAt(f) != ' ' && str.charAt(l) != ' ') break;
        }
        ans = str.substring(f, l);
        return ans;
    }
    public static void main(String[] args) {
        String str = "  Welcome to Coding   Ninjas   ";

        String s = helper(str);
        System.out.println(s);

        System.out.println(specialReverse(s));
    }
}
