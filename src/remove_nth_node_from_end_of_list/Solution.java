package remove_nth_node_from_end_of_list;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        ListNode left = temp;
        ListNode right = head;
        
        while (n > 0 && right != null) {
        	right = right.next;
        	n = n - 1;
        }
        
        while (right != null) {
        	left = left.next;
        	right = right.next;
        }
        
        left.next = left.next.next;
        
        return temp.next;
    }
}
