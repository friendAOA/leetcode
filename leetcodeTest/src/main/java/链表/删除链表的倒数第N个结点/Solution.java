package 链表.删除链表的倒数第N个结点;


import 链表.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead=new ListNode();
        dummyHead.next=head;

        ListNode slow=dummyHead;
        ListNode fast=dummyHead;

        for(int i=0;i<n;i++){
          if(fast.next!=null){
            fast=fast.next;
         }
        }
        // fast=fast.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummyHead.next;
    }
}