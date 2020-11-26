package cn.forxiao.util;

import cn.forxiao.list.node.ListNode;

/**
 * @author mufeng
 * @description 比较链表
 * @date 2020-11-27 03:45
 **/
public class CompareListUtil {

    public static boolean compareList(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;

        while (p != null && q != null && p.val == q.val) {
            p = p.next;
            q = q.next;
        }

        if (p != null) {
            return p.equals(q);

        } else {
            return q == null;
        }
    }

}
