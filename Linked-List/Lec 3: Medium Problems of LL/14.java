// Add 1 to a number represented as linked list

class Solution {
    public static Node addOne(Node head) {
        // Helper function to add one from the end
        int carry = addOneUtil(head);
        
        // If there is a carry after processing all nodes, add a new node at the front
        if (carry > 0) {
            Node newNode = new Node(carry);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    
    private static int addOneUtil(Node node) {
        // Base case: If the node is null, return carry as 1
        if (node == null) {
            return 1;
        }
        
        // Recursive call to process the next node
        int carry = addOneUtil(node.next);
        
        // Update the node's value and calculate new carry
        int sum = node.data + carry;
        node.data = sum % 10;
        return sum / 10;
    }
}