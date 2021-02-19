package cn.forxiao.list.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author mufeng
 * @description 链表节点
 * @date 2020-10-20 01:24
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        List<Integer> vals = new ArrayList<>();
        vals.add(this.val);
        ListNode node = this;
        while (node.next != null) {
            node = node.next;
            vals.add(node.val);
        }
        return Arrays.toString(vals.toArray());
    }
}
