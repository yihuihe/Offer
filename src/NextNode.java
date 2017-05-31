/**
 * Created by hyh on 2017/5/30.
 */

public class NextNode {
    static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }

    public static void connect(TreeLinkNode root) {
        if(root == null)
            return ;
        TreeLinkNode pre = root;
        TreeLinkNode phead =null;
        int flag =0;
        while(pre!=null){
            TreeLinkNode head = new TreeLinkNode(Integer.MIN_VALUE);
            while(pre!=null){
                if(pre.left!=null){
                    head.next = pre.left;
                    if(flag ==0){
                        phead = head.next;
                        flag=1;
                    }
                    head = head.next;
                    if(pre.right!=null){
                        head.next = pre.right;
                        head = head.next;
                    }
                }
                else if(pre.right!=null){
                    head.next = pre.right;
                    if(flag ==0){
                        phead = head.next;
                        flag=1;
                    }
                    head = head.next;
                }
                else
                    return;
                /*
                if(pre.next !=null){
                    if(pre.next.left!=null)
                        head.next = pre.next.left;
                    else if(pre.next.right!=null)
                        head.next =
                }
                 */
                pre = pre.next;
            }
            pre = phead;
            flag =0;
        }


    }
    public static void main(String[] args){
        TreeLinkNode node1= new TreeLinkNode(1);
        TreeLinkNode node2= new TreeLinkNode(2);
        TreeLinkNode node3= new TreeLinkNode(3);
        TreeLinkNode node4= new TreeLinkNode(4);
        TreeLinkNode node5= new TreeLinkNode(5);
        TreeLinkNode node6= new TreeLinkNode(6);
        TreeLinkNode node7= new TreeLinkNode(7);

        node1.left= node2;
        node1.right=node3;
        node2.left =node4;
        node2.right=node5;
        node3.left = node6;
        node3.right =node7;

        connect(node1);





    }
}
