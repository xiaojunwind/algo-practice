package cn.forxiao.list;

import cn.forxiao.list.node.ListNode;
import cn.forxiao.util.CompareListUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author mufeng
 * @description 反转链表测试
 * @date 2020-11-27 03:41
 **/
class ReverseListTest {

    private ReverseList reverseList;

    @BeforeEach
    void init() {
        reverseList = new ReverseList();
    }

    @ParameterizedTest
    @MethodSource("dataProvide")
    void testDoublePointerThreeSum(ListNode head, ListNode expected) {
        ListNode result = reverseList.reverseList(head);
        boolean matched = CompareListUtil.compareList(expected,result);
        Assertions.assertTrue(matched);
    }

    static Stream<Arguments> dataProvide(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(2);
        ListNode three1 = new ListNode(3);
        ListNode four1 = new ListNode(4);
        ListNode five1 = new ListNode(5);

        five1.next = four1;
        four1.next = three1;
        three1.next = two1;
        two1.next = one1;

        return Stream.of(
                Arguments.arguments(one, five1)
        );
    }

}
