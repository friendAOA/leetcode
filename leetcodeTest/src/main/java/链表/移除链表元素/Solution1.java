package 链表.移除链表元素;

import 链表.ListNode;

class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dummyHead= new ListNode();
        dummyHead.next=head;
        ListNode cur=dummyHead;
        while(cur.next != null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return dummyHead.next;

    }
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Solution1 solution=new Solution1();
        ListNode res=solution.removeElements(node1,3);
    }
}