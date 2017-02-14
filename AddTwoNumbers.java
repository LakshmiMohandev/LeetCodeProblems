/*
 * 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 */


		/**
		 * Definition for singly-linked list.
		 * public class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode(int x) { val = x; }
		 * }
		 */
		public class Solution {
		    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		        ListNode result = new ListNode(0);
				ListNode pointer = result;
				int remainder = 0;

				while (l1 != null || l2 != null) {

					int val1 = l1 == null ? 0 : l1.val;
					int val2 = l2 == null ? 0 : l2.val;
					int newVal = val1 + val2;

					ListNode node = new ListNode((newVal + remainder) % 10);
					pointer.next = node;
					pointer = pointer.next;
					remainder = (newVal + remainder) / 10;

					l1 = l1 == null ? null : l1.next;
					l2 = l2 == null ? null : l2.next;
				}

				pointer.next = remainder == 0 ? null : new ListNode(remainder);

				return result.next;
		    }
		}