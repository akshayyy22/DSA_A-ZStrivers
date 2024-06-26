// Detect a loop in LL

public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode Hare = head;
        ListNode Tortoise = head;
        while(Hare != null && Hare.next != null){
            Hare = Hare.next.next;
            Tortoise = Tortoise.next;
            if(Hare == Tortoise){
                return true;
            }
        }
        return false;
        
    }
}