package TreeInJava;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {
    public static int maxDepth(TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);
        int cnt = 0;
        while(!q.isEmpty()){
            cnt++;
            for(int i = 0; i < q.size(); i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);

        int depth = maxDepth(root);
        System.out.println(depth);
    }
}
