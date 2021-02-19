package cn.forxiao.list;

import cn.forxiao.list.node.ListNode;

/**
 * @author mufeng
 * @description 24. 两两交换链表中的节点 https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @date 2021-02-19
 **/
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode lastNode = null;
        ListNode start = head;
        boolean swapHead = true;
        while (start != null && start.next != null) {
            ListNode left = start;
            ListNode right = start.next;

            start = right.next;
            right.next = left;
            if (lastNode != null) {
                lastNode.next = right;
            }

            left.next = start;
            if (swapHead) {
                head = right;
                swapHead = false;
            }

            lastNode = left;
        }
        return head;



    }

}
