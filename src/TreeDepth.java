/**
 * Created by hyh on 2017/3/29.
 */
public class TreeDepth {
    public static  class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    public static int TreeDepth_Solution(TreeNode root) {
        int max = 0,left=0,right=0;
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        if(root.left != null){
            left = TreeDepth_Solution(root.left);
        }
        if(root.right != null){
            right = TreeDepth_Solution(root.right);
        }

        max =  left > right ? left : right;
        return 1 + max;
    }
}
