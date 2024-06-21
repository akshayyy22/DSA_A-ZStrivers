// Introduction to Linked List


class Solution {
    static Node constructLL(int arr[]) {
        if (arr.length == 0) return null; // Handle empty array case

        Node head = new Node(arr[0]); // Create the head node with the first element of the array
        Node current = head; // Initialize the current node to the head

        // Iterate through the remaining elements of the array and create nodes
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]); // Create a new node with the current array element
            current = current.next; // Move to the next node
        }

        return head; // Return the head of the constructed linked list
    }
}
