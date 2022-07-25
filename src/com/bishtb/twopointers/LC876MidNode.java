package com.bishtb.twopointers;

public class LC876MidNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * Given the head of a singly linked list, return the middle node of the linked list.
	 */
	public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
            
    }

	/*
	 * remove nth node from the end
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        if(fast == null)
            return head.next;
        while(fast.next !=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
