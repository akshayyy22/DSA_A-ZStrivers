// Reverse a DLL

public static Node reverseDLL(Node  head)
{
    Node current = head;
    Node temp = null;
    while(current != null){
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
    }
    
    if(temp != null){
        head  = temp.prev;
    }
    return head;
}
