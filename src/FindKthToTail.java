/**
 * Created by hyh on 2017/4/4.
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class FindKthToTail_Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null)
            return null;
        int count = 1;
        int index =0;
        ListNode pHead = head;
        ListNode result =null;
        while(head.next != null){
            count++;
            head = head.next;
        }
        if(k>count)
            return null;
        else{
            index = count - k;
            count = 1;
        }
        while(pHead != null){
            if((count-1)==index)
            {
                result =  pHead;

            }
            count++;
            pHead = pHead.next;
        }
        return result;
    }
}
public class FindKthToTail {
    public static void main(String[] args){
        FindKthToTail_Solution find = new FindKthToTail_Solution();
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);

        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = null;

        System.out.println(find.FindKthToTail(list1,1).val);
    }
}
