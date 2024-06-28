// 	Insert a node in DLL

class GfG {
    // Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data) {
        Node newNode = new Node(data);
        Node current = head_ref;

        // Traverse to the node just before the desired position
        for (int i = 0; i < pos; i++) {
            if (current == null) {
                return; // If position is out of bounds, do nothing
            }
            current = current.next;
        }

        if (current == null) {
            return; // If current is null, the position is out of bounds
        }

        // Adjust the pointers to insert the new node
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }
}