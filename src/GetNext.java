/**
 * Created by hyh on 2017/3/30.
 */
 class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
 class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)
            return pNode;
        TreeLinkNode pNow = pNode;
        TreeLinkNode pFather = null;
        if( pNow.right!=null){
            pNow = pNow.right;
            while(pNow.left != null){
                pNow = pNow.left;
            }
            return pNow;
        }
        else if(pNow.next !=null){
            pFather = pNow.next;
            if(pNow == pFather.left)
                return pFather;
            if(pNow == pFather.right){
                while(pFather!=null && pNow != pFather.left){
                    pNow = pFather;
                    pFather = pFather.next;
                }
                return pFather;
            }

        }
        return null;

    }
}
public class GetNext {
     public  static void main(String[] args){
         Solution solution = new Solution();
         TreeLinkNode linkNode = null;
         TreeLinkNode linkNode1 = new TreeLinkNode(1);
         TreeLinkNode linkNode2 = new TreeLinkNode(2);
         TreeLinkNode linkNode3 = new TreeLinkNode(3);
         TreeLinkNode linkNode4 = new TreeLinkNode(4);
         TreeLinkNode linkNode5 = new TreeLinkNode(5);
         TreeLinkNode linkNode6 = new TreeLinkNode(6);

         linkNode1.next = null;
         linkNode1.left = linkNode2;
         linkNode1.right = linkNode3;

         linkNode2.next = linkNode1;
         linkNode2.left = linkNode4;
         linkNode2.right= linkNode6;

         linkNode3.next = linkNode1;
         linkNode3.left = null;
         linkNode3.right = linkNode5;

         linkNode4.next =linkNode2;
         linkNode4.left = null;
         linkNode4.right =null;

         linkNode5.next = linkNode3;
         linkNode5.left =null;
         linkNode5.right = null;

         linkNode6.next = linkNode2;
         linkNode6.left = null;
         linkNode6.right =null;

         linkNode = solution.GetNext(linkNode5);
         System.out.print(linkNode.val);
     }

}
