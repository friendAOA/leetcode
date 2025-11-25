package 链表.翻转链表;

import 链表.ListNode;

/**
 * @Author: 昊辰（汪程昊）
 * @Date : 2025/11/25
 * @Description :
 * @Modified By : Copyright(c) cai-inc.com
 */
public class solution1 {

    /**
     *
     * 翻转链表
     * 输入：head = [1,2,3,4,5]
     * 输出：[5,4,3,2,1]
     * 输入：head = [1,2]
     * 输出：[2,1]
     *
     * 双指针
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre=new ListNode();
            pre=null;
            ListNode cur=head;
            while(cur!=null){
                ListNode temp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=temp;
            }
            return pre;
        }
    }
}
