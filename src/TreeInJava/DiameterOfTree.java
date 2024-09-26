package TreeInJava;

public class DiameterOfTree {
    static int diameter = 0;
    public static int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        diameter = Math.max(diameter, left + right + 1);
        return  Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
//        solve(root);
        System.out.println(solve(root));
        System.out.println(diameter);


    }
}
