package TreeInJava;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int x){
        this.val = x;
        this.left = null;
        this.right = null;
    }

    TreeNode(int x, TreeNode left, TreeNode right){
        this.val = x;
        this.left = left;
        this.right = right;
    }


}
