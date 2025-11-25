package 链表.移除链表元素;

class Solution2 {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return head;
            }

            // 假设 removeElements() 返回后面完整的已经去掉val节点的子链表
            // 在当前递归层用当前节点接住后面的子链表
            // 随后判断当前层的node是否需要被删除，如果是，就返回
            // 也可以先判断是否需要删除当前node，但是这样条件语句会比较不好想
            head.next = removeElements(head.next, val);
            if (head.val == val) {
                return head.next;
            }
            return head;

            // 实际上就是还原一个从尾部开始重新构建链表的过程
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
        Solution2 solution=new Solution2();
        ListNode res=solution.removeElements(node1,3);
    }
}