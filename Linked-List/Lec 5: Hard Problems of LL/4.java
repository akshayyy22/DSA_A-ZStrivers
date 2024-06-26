//61. Rotate List

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode oldtail = head;
        int length = 1;
        while(oldtail.next != null){
            length++;
            oldtail = oldtail.next;
        }
        oldtail.next = head;

        k = k % length;
        ListNode newTail = head;
        for(int i = 0 ; i < length - k - 1 ; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        
        // Break the circular link
        newTail.next = null;

        return newHead;
        
    }
}