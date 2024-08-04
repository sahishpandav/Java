package JavaStacks;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(24);
        System.out.println(st.pop());

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

//       returns the first inserted item but do not remove it
        System.out.println(q.peek());
//        removes the first inserted item
        q.remove();


        System.out.println("Deque");

        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(101);
        dq.addFirst(102);
        dq.addFirst(103);


        dq.addLast(201);
        dq.addLast(202);
        dq.addLast(203);

        dq.removeFirst();
        dq.removeLast();
        System.out.println("First " + dq.peekFirst());
        System.out.println("Last " + dq.peekLast());

    }
}
