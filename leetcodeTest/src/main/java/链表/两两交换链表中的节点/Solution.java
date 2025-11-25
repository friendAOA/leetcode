package 链表.两两交换链表中的节点;

import 链表.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        //下面注释会导致cur是一个全新的、与dummyHead无关的节点，导致交换时，不会影响dummyHead指向的原链表
        // ListNode cur=  new ListNode();
        // cur.next=head;
        ListNode cur = dummyHead;

        while (cur.next != null && cur.next.next != null) {
            ListNode temp = cur.next;//临时存储第一个节点
            ListNode temp1 = cur.next.next.next;//临时存储第三个节点
            //交换
            cur.next = cur.next.next;
            cur.next.next = temp;
            temp.next = temp1;


            //进行下一轮
            cur = cur.next.next;
        }

        return dummyHead.next;
    }
}