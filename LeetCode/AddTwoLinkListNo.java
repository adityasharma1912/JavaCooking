package leetCode;

public class AddTwoLinkListNo {

	public static void main(String args[]) {

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode listNode = new ListNode(0);
		listNode.val = 1;
		listNode.next = null;
		return listNode;
	}
}
