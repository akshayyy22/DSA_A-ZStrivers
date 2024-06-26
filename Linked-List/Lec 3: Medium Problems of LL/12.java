// Sort a linked list of 0s, 1s and 2s
 
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        
        Node zeroDummy = new Node(0);
        Node oneDummy = new Node(0);
        Node twoDummy = new Node(0);
        
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;
        
        Node CurrNode = head;
        while(CurrNode != null){
            if(CurrNode.data == 0){
                zero.next = CurrNode;
                zero = zero.next;
            }
            else if(CurrNode.data == 1){
                one.next = CurrNode;
                one = one.next;
            }
            else{
                two.next = CurrNode;
                two = two.next;
            }
            
            CurrNode = CurrNode.next;
            
        }
        
        zero.next = (oneDummy.next != null ) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;
        
        return zeroDummy.next;
      
    }
}
