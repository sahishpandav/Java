package TreeInJava;

import java.util.*;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return new ArrayList<>();
        q.offer(root);
        List<List<Integer>> ans = new ArrayList<>();
        boolean flag = true;
        while(!q.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int size = 0;
            size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                ls.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            if(flag){
                ans.add(ls);
                flag = false;
            }else{
                Collections.reverse(ls);
                ans.add(ls);
                flag= true;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
