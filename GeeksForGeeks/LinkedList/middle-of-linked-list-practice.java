/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        if(head==null){
            return -1;
        }
        Node p=head;
        Node q=head;
        while(q!=null && q.next!=null){
            p=p.next;
            q=q.next.next;
        }
        return p.data;
    }
}