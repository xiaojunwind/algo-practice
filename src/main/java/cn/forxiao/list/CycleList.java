package cn.forxiao.list;

import cn.forxiao.list.node.ListNode;

/**
 * @Description 141. 环形链表 https://leetcode-cn.com/problems/linked-list-cycle
 * @Author mufeng
 * @Date 2021/2/21
 **/
public class CycleList {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
