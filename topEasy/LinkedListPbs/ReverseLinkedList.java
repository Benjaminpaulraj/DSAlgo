package leetCode.topEasy.LinkedListPbs;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = ListNode.createListNode();
		ListNode.printAll(head);
		//System.out.println("\n=====");
		ListNode.printAll(reverseList1(head));
	}
    public static ListNode reverseList(ListNode head) {
        
    	if(head == null || head.next == null) return head;
    	
    	//1->2-> 3->4->5 ->null
    	//1->2->null
    	
    	ListNode prev = null;
    	ListNode curr = head;
    	while(curr != null) {
    		
    		ListNode next = curr.next;
    		curr.next = prev;
    		if(prev==head)prev.next = null;
    		
    		prev = curr;
    		curr = next;

    	}
    	return prev;
    }
    
    public static ListNode reverseList1(ListNode head) {
        
    	if(head == null || head.next == null) return head;
    	
    	//1->2-> 3->4->5 ->null
    	//1->2->null
    	
    	ListNode curr = head;
    	ListNode prev = null;
    	ListNode rem = null;
    	while(curr != null) {
    		
    		rem = curr.next;
    		curr.next = prev;
    		
    		prev = curr;
    		curr = rem;

    	}
    	return prev;
    }    
}
