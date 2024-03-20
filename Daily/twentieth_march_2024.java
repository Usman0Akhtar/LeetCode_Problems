/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null || list2==null) {
            return null;
        }
        ListNode val = list1, start = list1, end =list1;
        int count = 0;

        while(val!=null) {
            count++;
            if(count==a) {
                start = val;
            }
            val = val.next;
            if(count==b+1) {
                end = val;
            }
        }

        val = list2;
        start.next = list2;
        while(val.next!=null) {
            val=val.next;
        }

        val.next = end;
        return list1;
    }
}