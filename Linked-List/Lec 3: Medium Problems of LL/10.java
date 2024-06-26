// Delete the middle node of LL

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Check if the list is empty or has only one element
        if (head == null || head.next == null) {
            return null; // If there is only one element, return null
        }

        ListNode hare = head;
        ListNode tortoise = head;

        // Move hare by 2 steps initially
        hare = hare.next.next;
        
        // Move hare and tortoise until hare reaches the end
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }

        // Delete the middle node
        ListNode middle = tortoise.next;
        tortoise.next = middle.next;

        return head;
    }
}
