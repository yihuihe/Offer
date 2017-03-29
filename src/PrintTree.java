import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by hyh on 2017/3/29.
 */
public class PrintTree {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null)
            return list;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        int height = 1;
        stack1.push(pRoot);
        while(!(stack1.size()==0 && stack2.size()==0)){
            height++;
            if(height % 2 ==0){
                ArrayList<Integer> listTemp = new ArrayList<>();
                while(stack1.size() !=0){
                    TreeNode temp = stack1.pop();
                    listTemp.add(temp.val);
                    if(temp.left!=null)
                        stack2.push(temp.left);
                    if(temp.right!=null)
                        stack2.push(temp.right);
                }
                list.add(listTemp);
            }
            if(height % 2 == 1){
                ArrayList<Integer> listTemp = new ArrayList<>();
                while(stack2.size() !=0){
                    TreeNode temp = stack2.pop();
                    listTemp.add(temp.val);
                    if(temp.right!=null)
                        stack1.push(temp.right);
                    if(temp.left!=null)
                        stack1.push(temp.left);
                }
                list.add(listTemp);
            }

        }
        return list;

    }
}
