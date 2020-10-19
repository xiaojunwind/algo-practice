package cn.forxiao.list;

import cn.forxiao.list.node.ListNode;

/**
 * @author mufeng
 * @description 206.反转链表 https://leetcode-cn.com/problems/reverse-linked-list/
 * @date 2020-10-20 01:19
 **/
public class ReverseList {

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
