// 160. Intersection of Two Linked Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int cntA = 0;
        ListNode currNode = headA;
        while(currNode != null){
            cntA++;
            currNode = currNode.next;
        }

        int cntB = 0;
        currNode = headB;
        while(currNode != null){
            cntB++;
            currNode = currNode.next;
        }

         // Step 2: Calculate the difference in lengths
        int diff = Math.abs(cntA - cntB);

        ListNode tempA = headA;
        ListNode tempB = headB;

        if (cntA > cntB) {
            for (int i = 0; i < diff; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                tempB = tempB.next;
            }
        }

        while(tempA != null && tempB != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
        
    }
}