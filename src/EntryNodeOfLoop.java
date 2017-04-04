/**
 * Created by hyh on 2017/4/4.
 */

 class NodeInRing_Solution {

    public  ListNode NodeInRing(ListNode pHead){
        if(pHead == null)
            return null;
        ListNode low = pHead.next;
        if(low == null)
            return null;
        ListNode fast = low.next;
        while(fast != null && low != null){
            if(fast == low)
                return fast;

            low = low.next;
            fast = fast.next;
            if(fast != null)
                fast = fast.next;

        }
        return null;

    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode nodeInRing = NodeInRing(pHead);
        if(nodeInRing == null)
            return null;
        ListNode temp = nodeInRing;
        int count = 0;
        while(temp.next !=null){
            temp = temp.next;
            count++;
            if(temp == nodeInRing){
                break;
            }
        }
        temp = pHead;
        for(int i=0;i<count;i++)
        {
            temp = temp.next;
        }
        ListNode behind = pHead;
        while(temp != behind){
            temp = temp.next;
            behind = behind.next;
        }
        return temp;
    }
}

