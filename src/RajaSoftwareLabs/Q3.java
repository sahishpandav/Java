package RajaSoftwareLabs;

public class Q3 {
//    Fibonacci Member
//    Given a number N, figure out if it is a member of fibonacci series or not.
//    Return true if the number is member of fibonacci series else false.

    public static boolean funct(int n){
        if(n <= 1){
            return true;
        }
        int last = 0, secondLast = 1, curr = 0;
        while(curr <= n){
            if(curr == n){
                return true;
            }
            curr = last + secondLast;
            last = secondLast;
            secondLast = curr;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 144;
        System.out.println(funct(n));
    }

}
