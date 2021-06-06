package cn.forxiao.list;

import cn.forxiao.list.node.ListNode;

/**
 * @Description 25. K 个一组翻转链表 https://leetcode-cn.com/problems/reverse-nodes-in-k-group
 * @Author xiaojun
 * @Date 2021/3/3
 **/
public class ReverseKGroupList {

    /**
     * 1.输入输出边界值判断
     * 2.最小执行单元及跳出规则
     * 3.辅助对象设计及使用规则
     *
     * @param head 链表
     * @param k k个节点
     * @return 翻转后的链表
     */
    public ListNode reverseKGroup(ListNode head,int k) {
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;

        while (head != null) {
            ListNode tail = pre;
            // 查看剩余部分长度是否大于等于 k
            for (int i = 0; i < k; ++i) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode nex = tail.next;
            ListNode[] reverse = myReverse(head, tail);
            head = reverse[0];
            tail = reverse[1];
            // 把子链表重新接回原链表
            pre.next = head;
            tail.next = nex;
            pre = tail;
            head = tail.next;
        }

        return hair.next;
    }

    public ListNode[] myReverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode nex = p.next;
            p.next = prev;
            prev = p;
            p = nex;
        }
        return new ListNode[]{tail, head};
    }

}
