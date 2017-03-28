import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hyh on 2017/3/28.
 */
public class PrintFromTopToBottom {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static ArrayList<Integer> PrintFromTopToBottom_solution(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root ==null)
            return  arrayList;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size()!=0){
            TreeNode temp = queue.poll();
            arrayList.add(temp.val);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return arrayList;

    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right= treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right =treeNode7;
        treeNode4.left = treeNode8;
        treeNode4.right = treeNode9;
        ArrayList<Integer> a = PrintFromTopToBottom_solution(treeNode1);
        for(Integer t : a)
            System.out.print(t+" ");
    }
}
