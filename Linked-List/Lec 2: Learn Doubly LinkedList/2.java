// Reverse a LinkedList [Iterative]

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode PrevNode = null;
        ListNode CurrNode = head;
        while (CurrNode != null){
            ListNode NextNode = CurrNode.next;
            CurrNode.next = PrevNode;
            PrevNode = CurrNode;
            CurrNode = NextNode;
        }
        return PrevNode;

    }
}
