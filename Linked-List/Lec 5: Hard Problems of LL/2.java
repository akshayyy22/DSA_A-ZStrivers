// Flattening a Linked List    
    /*Node class  used in the program
    class Node
    {
        int data;
        Node next;
        Node bottom;
    
        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }
    */
    /*  Function which returns the  root of
        the flattened linked list. */
    class GfG {
        Node flatten(Node root) {
            // Base cases
            if (root == null || root.next == null) {
                return root;
            }
    
            // Recursively flatten the next list
            root.next = flatten(root.next);
    
            // Merge the current list with the next list
            root = mergeTwoLists(root, root.next);
    
            return root;
        }
    
        // Helper function to merge two sorted linked lists
        Node mergeTwoLists(Node a, Node b) {
            if (a == null) return b;
            if (b == null) return a;
    
            Node result;
    
            if (a.data < b.data) {
                result = a;
                result.bottom = mergeTwoLists(a.bottom, b);
            } else {
                result = b;
                result.bottom = mergeTwoLists(a, b.bottom);
            }
    
            result.next = null;  // Ensure the `next` pointer is null in the merged list
            return result;
        
        }
    }