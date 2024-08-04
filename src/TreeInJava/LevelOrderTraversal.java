package TreeInJava;

import java.util.*;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();

//        add root node inside the queue
        q.offer(root);
        List<Integer> level = new ArrayList<>();

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
//                System.out.println(node.val);
                level.add(node.val);
                if(node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            res.add(new ArrayList<>(level));
//            System.out.println(level);
            level.clear();
        }
//        System.out.println(res);
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


        List<List<Integer>> result = levelOrderTraversal(root);
        for(List<Integer> level: result){
            System.out.println(level);
        }
    }
}
