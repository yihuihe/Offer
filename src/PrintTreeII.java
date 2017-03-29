import java.util.ArrayList;
import java.util.LinkedList;
import  java.util.Queue;

/**
 * Created by hyh on 2017/3/29.
 */
public class PrintTreeII {
    public static  class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public  static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(pRoot);
        int count =0;
        int lastCount = 1;
        while(queue.size()!=0){
            ArrayList<Integer> listTemp = new ArrayList<>();
            while(lastCount!=0){
                lastCount--;
                TreeNode temp = queue.poll();
                listTemp.add(temp.val);
                if(temp.left != null){
                    queue.add(temp.left);
                    count++;
                }
                if(temp.right != null){
                    queue.add(temp.right);
                    count++;
                }

            }
            lastCount = count;
            count = 0;
            list.add(listTemp);

        }
        return list;


    }
    public  static  void  main(String[] args){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.left =node4;
        node2.right =node5;
        node3.right = node6;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list = Print(node1);

    }
}
