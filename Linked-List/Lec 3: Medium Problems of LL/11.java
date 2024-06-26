// 148. Sort List


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

 import java.util.Arrays;

class Solution {
    public ListNode sortList(ListNode head) {
        // Edge case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Count the number of nodes
        ListNode currNode = head;
        int cnt = 0;
        while (currNode != null) {
            cnt++;
            currNode = currNode.next;
        }

        // Step 2: Create an array and populate it with the list values
        int[] arr = new int[cnt];
        currNode = head;
        int i = 0;
        while (currNode != null) {
            arr[i++] = currNode.val;
            currNode = currNode.next;
        }

        // Step 3: Sort the array
        Arrays.sort(arr);

        // Step 4: Convert the sorted array back to a linked list
        ListNode sortedHead = new ListNode(arr[0]);
        ListNode sortedCurr = sortedHead;
        for (int j = 1; j < arr.length; j++) {
            sortedCurr.next = new ListNode(arr[j]);
            sortedCurr = sortedCurr.next;
        }

        return sortedHead;
    }
}
