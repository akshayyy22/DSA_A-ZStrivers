// Search in Linked List


class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node currNode = head;
        while(currNode != null){
            if(currNode.data == key){
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
}