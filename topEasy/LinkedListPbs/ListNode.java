package leetCode.topEasy.LinkedListPbs;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public static void printAll(ListNode node) {
		while (node != null) {
			System.out.print(node.val + "-->");
			node = node.next;
		}
	}

	public static ListNode createListNode() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next.next = new ListNode(1);
		return head;
	}
	public static ListNode createListNode2() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next = new ListNode(1);
		//head.next.next.next.next.next.next = new ListNode(7);
		return head;
	}	
	public static void main(String a[]) {
		
		ListNode l1 = ListNode.createListNode2();
		
		//ListNode res = new MergeTwoSortedLists().mergeTwoLists(ListNode.createListNode(), ListNode.createListNode2());
		//ListNode.printAll(res);
		
		System.out.println(new PalindromeLinkedList().isPalindrome(l1));
		
		
	}
}
