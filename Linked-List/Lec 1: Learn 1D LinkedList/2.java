// Linked List Insertion

class Solution
{
    //Function to insert a node at the beginning of the linked list.
   Node insertAtBeginning(Node head, int x)
    {
        Node newNode = new Node(x); // Create a new node with value x
        newNode.next = head; // Point the new node's next to the current head
        head = newNode; // Update head to be the new node
        return head; // Return the new head of the list
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node newNode = new Node(x); // Create a new node with value x
        if(head == null){
            head = newNode; // If the list is empty, the new node becomes the head
            return head; // Return the new head of the list
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next; // Traverse to the end of the list
        }
        currNode.next = newNode; // Point the last node's next to the new node
        return head; // Return the head of the list
    }
}