package leetCode.topEasy.LinkedListPbs;


public class DeleteNodeInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void deleteNode(ListNode node) {
        
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}
