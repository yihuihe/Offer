/**
 * Created by hyh on 2017/3/29.
 */
public class IsBalancedTree {
    public static  class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public static int TreeDepth(TreeNode root){
        int max = 0;
        int left =0, right=0;
        if(root == null)
            return 0;
        if(root.left ==null && root.right == null)
            return 1;
        if(root.left != null)
            left = TreeDepth(root.left);
        if(root.right != null)
            right = TreeDepth(root.right);
        max = left > right  ? left : right;
        return 1+max;
    }
    public static  boolean IsBalanced_Solution(TreeNode root) {
        int left= 0,right = 0;
        int temp  = 0;
        if(root == null)
            return true;

        if(root.left != null)
            left = TreeDepth(root.left);
        if(root.right != null)
            right = TreeDepth(root.right);

        if(Math.abs(left-right)>1)
            return false;

        return (IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right));


    }
}
