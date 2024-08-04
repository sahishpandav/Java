package TreeInJava;

import com.sun.jdi.IntegerValue;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Stack;

public class IterativeInOrderTraversal {
    public static ArrayList<Integer> iterativeInOrderTraversal(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.add(root);
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            while (curr.left != null) {
                st.push(curr);
                curr = curr.left;
            }
            res.add(curr.val);
            st.pop();
            if(curr.right != null) st.add(curr.right);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<Integer> result = iterativeInOrderTraversal(root);
        System.out.println(result);

    }
}
