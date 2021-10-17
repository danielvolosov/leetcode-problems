package delete_node_in_a_linked_list;

public class Solution {
	public void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;
	}
}
