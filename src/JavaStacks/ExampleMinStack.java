package JavaStacks;

import java.util.*;

class Pair{
    int first;
    int second;
    Pair(int x, int y){
        this.first = x;
        this.second = y;
    }
}

class MinStack{
    Stack<Pair> minStack = new Stack<>();

    void pushMinStack(int x){
        if(minStack.isEmpty()){
            Pair temp = new Pair(x, x);
            minStack.push(temp);
        }else{
            Pair t = minStack.peek();
            Pair insertingPair = new Pair(x, Math.min(t.second, x));
            minStack.push(insertingPair);
        }
    }

    int popMinStack(){
        if(minStack.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            Pair t = minStack.pop();
            return t.second;
        }
        return -100;
    }

}

public class ExampleMinStack {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 5, -2, 6, -3, -5};
        MinStack st = new MinStack();
        for(int i = 0; i < arr.length; i++){
            st.pushMinStack(arr[i]);
//            System.out.println(arr[i]);
        }

        int n = arr.length;
        while(n > 0){
            System.out.println(st.popMinStack());
            n--;
        }
    }
}
