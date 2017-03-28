import java.util.Stack;

/**
 * Created by hyh on 2017/3/28.
 */
public class FindFirstCommonNode {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode FindFirstCommonNode_Solution(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null)
            return null;
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        int count1= 0;
        int count2= 0;
        stack1.push(pHead1);
        stack2.push(pHead2);
        while(pHead1.next!=null){
            pHead1 = pHead1.next;
            stack1.push(pHead1);
            count1++;
        }
        while(pHead2.next!=null){
            pHead2 = pHead2.next;
            stack2.push(pHead2);
            count2++;
        }
        int min = count1 > count2 ? count2 : count1;
        ListNode node1 = null;
        ListNode node2 = null;
        ListNode lastNode = null;
        for(int i=min;i>=0;i--){
            node1 = stack1.pop();
            node2 = stack2.pop();
            if(node1.val != node2.val){
                break;
            }
            else{
                lastNode = node1;
            }

        }
        return lastNode;
    }
    public  static void main (String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(3);
        ListNode node9 = new ListNode(4);
        ListNode node10 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

        ListNode list = FindFirstCommonNode_Solution(node1,node6);
        System.out.print(list.val);
    }
}
