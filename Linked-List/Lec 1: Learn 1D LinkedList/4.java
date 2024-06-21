// Count Linked List Nodes


class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int count = 0;
        Node currNode = head;
        while (currNode != null){
            count++;
            currNode = currNode.next;
        }
        return count;
    }
}
    