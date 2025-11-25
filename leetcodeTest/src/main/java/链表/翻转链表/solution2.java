package 链表.翻转链表;

/**
 * @Author: 昊辰（汪程昊）
 * @Date : 2025/11/25
 * @Description :
 * @Modified By : Copyright(c) cai-inc.com
 */
public class solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode();
        pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public ListNode reverse(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }
        ListNode temp = cur.next;
        cur.next = pre;
        pre = reverse(temp, cur);
        return pre;
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
        solution2 solution=new solution2();
        ListNode res=solution.reverseList(node1);
        //输出链表的所有值
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
}
