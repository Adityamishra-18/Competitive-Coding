    public Node(int x) {
        data = x;
        next = null;
    }

}*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public Node makeUnion(Node head1, Node head2) {
        Set<Integer> visited = new HashSet<>();

        Node dummy = new Node(0);
        Node tail = dummy;

        Node curr1 = head1;
        while (curr1 != null) {
            if (!visited.contains(curr1.data)) {
                visited.add(curr1.data);
                tail.next = new Node(curr1.data);
                tail = tail.next;
            }
            curr1 = curr1.next;
        }

        Node curr2 = head2;
        while (curr2 != null) {
            if (!visited.contains(curr2.data)) {
                visited.add(curr2.data);
                tail.next = new Node(curr2.data);
                tail = tail.next;
            }
            curr2 = curr2.next;
        }

        return dummy.next;
    }
}