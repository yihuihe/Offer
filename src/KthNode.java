import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by hyh on 2017/3/31.
 */
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class KthNode {
    public static TreeNode KthNode_Solution(TreeNode pRoot, int k)
    {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(pRoot==null)
            return null;

        stack.push(pRoot);
        while(stack.size()!=0){
            TreeNode temp = stack.peek();
            if(temp.left != null){
                stack.push(temp.left);
                temp.left = null;
            }
            else{
                list.add(temp.val);
                stack.pop();
                if(temp.right != null){
                    stack.push(temp.right);
                }

            }
        }
        if(k<=0 || k>list.size())
            return null;
        int result = list.get(k-1);
        return (new TreeNode(result));

    }
}
