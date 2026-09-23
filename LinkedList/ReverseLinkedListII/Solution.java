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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(l==r)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p = dummy;
        int i = 1;
        ListNode before=null, after, left=null, right;

        while (i <= r) {
            if (i == l) {
                before = p;
                left = p.next;
            }
            p = p.next;
            i++;
        }

        right = p;
        after = right.next;

        ListNode prev = after;
        ListNode curr = left;

        while(curr != after){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        before.next=prev;
        return dummy.next;
    }
}