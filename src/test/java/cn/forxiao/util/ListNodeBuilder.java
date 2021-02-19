package cn.forxiao.util;

import cn.forxiao.list.node.ListNode;

public class ListNodeBuilder {

    public static ListNode build(int... array) {
        ListNode prevNode = null;
        ListNode head = null;
        for (int i = 0; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);
            if (i == 0) {
                head = node;
            }
            if (prevNode != null) {
                prevNode.next = node;
            }
            prevNode = node;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = build(1,2,3,4);
        System.out.println(head);
    }

}
