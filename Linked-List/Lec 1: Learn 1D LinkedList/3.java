// 237. Delete Node in a Linked List

class Solution {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null){
            System.out.print("list is empty");
        }

        node.val = node.next.val;
        node.next = node.next.next;
        
        
    }
}