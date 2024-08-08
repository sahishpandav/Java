package Stack;

import java.util.Stack;

public class InfixToPostfix {
    private static int priority(char ch){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '/' || ch == '*') return 2;
        if(ch == '^') return 3;
        return 0;
    }
    private static String infix2Postfix(String str){
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        //        start iterating throughout the string
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
//            if the current element is operand then directly add it to the answer
            if((curr >= 'A' && curr <= 'Z') || (curr >= 'a' && curr <= 'z') || (curr >= '0' && curr <= '9')){
                ans.append(curr);
            }
//            if the current element is operator
            else if(curr == '+' || curr == '*' || curr == '-' || curr == '/' || curr == '^'){
                if( st.isEmpty() || ( priority(st.peek()) < priority(curr) ) ) st.add(curr);
                else{
                    while( (priority(st.peek()) >= priority(curr)) ){
                        ans.append(st.pop());
                    }
                    st.add(curr);
                }
            }
//            if the element is opening bracket directly add it to stack
            else if(curr == '(') st.add('(');
//            if it is the closing bracket then pop and append all the elements from the stack till the opening bracket appears
            else if(curr == ')') {
                while(st.peek() != '('){
                    ans.append(st.pop());
                }
//                                remove closing bracket
                st.pop();
            }
        }
//        at last put all the elements remaining to the string from the stack
        while (!st.isEmpty()) ans.append(st.pop());
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)";
        String str2 = "(a+b+c)/d";
        String ans = infix2Postfix(str2);
        System.out.println(ans);
    }
}
