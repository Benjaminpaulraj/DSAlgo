package leetCode.topEasy.LinkedListPbs;

import java.util.Stack;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
     
    	if(head == null || head.next == null) return true;
    	ListNode slow = head, fast=head;
    	while(fast.next!=null) {
    		fast = fast.next;
    		if(fast.next !=null) {
    			fast = fast.next;
    		}
    		slow = slow.next;
    	}
    	
    	//Reverse from the slow pointer
    	
    	ListNode prev = null, node= slow, rem;
    	
    	while(node != null) {
    		rem = node.next;
    		node.next = prev;
    		
    		prev = node;
    		node = rem;
    	}
    	
    	System.out.println("==");
    	ListNode.printAll(prev);
    	slow = prev;
    	while(slow!= null) {
    		
    		if(slow.val !=head.val) return false;
    		head = head.next;
    		slow = slow.next;
    	}
    	
    	return true;
    }	
}
