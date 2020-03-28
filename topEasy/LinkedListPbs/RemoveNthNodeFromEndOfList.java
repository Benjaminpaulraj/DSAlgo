package leetCode.topEasy.LinkedListPbs;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		ListNode.printAll(head);
		
		ListNode.printAll(removeNthFromEnd(head, 2));
		
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
    	ListNode slow = head, fast = head, traverse;
    	int count = 1;
    	while(fast.next != null) {
    		if(fast.next.next != null ) {
    			fast = fast.next.next;
    			count+=2;
    		}else {
    			count++;
    			break;
    		}
    		slow = slow.next;
    	}
    	
    	
    	if(count == n) return head.next;
    	
    	int toTraverse = count-n-1;
    	traverse = head;
    	
    	while(toTraverse-- != 0) {
    		traverse = traverse.next;
    	}
    	traverse.next = traverse.next.next;
    	return head;
    }
}
