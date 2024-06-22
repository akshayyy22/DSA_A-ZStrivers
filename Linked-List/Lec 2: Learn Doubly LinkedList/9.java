// Remove Nth node from the back of the LL

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return null;
        }

        int size = 0;
        ListNode currNode = head;
        while(currNode !=null){
            currNode = currNode.next;
            size++;
        }
        if(n == size){
            return head.next;
        }

        int IndexToSearch = size - n;
        int i =1;
        ListNode PrevNode = head;
        while (i < IndexToSearch){
            PrevNode = PrevNode.next;
            i++;
        }

        PrevNode.next = PrevNode.next.next;
        return head;
    }
}