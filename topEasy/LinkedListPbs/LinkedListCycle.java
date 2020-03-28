package leetCode.topEasy.LinkedListPbs;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {

		if (head == null || head.next == null)
			return false;

		ListNode slow = head, fast = head.next;

		while (fast != null && slow != null) {
			if (slow == fast)
				return true;
			if (fast.next != null && fast.next.next != null)
				fast = fast.next.next;
			else
				return false;
			slow = slow.next;
		}

		return false;
	}
}
