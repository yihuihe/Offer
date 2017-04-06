/**
 * Created by hyh on 2017/4/6.
 */
/*
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
*/
class Tree_Solution {
    int count = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null)
        {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(String.valueOf(root.val));
        sb.append(",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }



    TreeNode Deserialize(String str) {
        if(str == null || str.equals("") )
            return null;
        TreeNode root = null;
        String[] nums = str.split(",");
        int length = nums.length;


        count++;
        if(!nums[count].equals("#"))
        {
            root = new TreeNode(Integer.valueOf(nums[count]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);

        }

        return root;


    }
}
public class SerializeAndDeserialize {
}
