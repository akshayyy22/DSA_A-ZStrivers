// Delete all occurrences of a key in DLL

class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node current = head;

        // Traverse the list
        while (current != null) {
            if (current.data == x) {
                // If node to be deleted is the head node
                if (current == head) {
                    head = head.next;
                }

                // Adjust next and prev pointers of the adjacent nodes
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current.prev != null) {
                    current.prev.next = current.next;
                }

                // Delete the current node (optional in Java)
                // free(temp); // Assuming you need to free memory explicitly in C/C++

                // Move to the next node
                Node nextNode = current.next;
                current = nextNode;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}