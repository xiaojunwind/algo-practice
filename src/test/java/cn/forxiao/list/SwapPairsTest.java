package cn.forxiao.list;

import cn.forxiao.list.node.ListNode;
import cn.forxiao.util.CompareListUtil;
import cn.forxiao.util.ListNodeBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author mufeng
 * @description 元素左右交换测试
 * @date 2021-02-19
 **/
public class SwapPairsTest {

    private SwapPairs swapPairs;

    @BeforeEach
    void init(){
        swapPairs = new SwapPairs();
    }

    @ParameterizedTest
    @MethodSource("data")
    void testSwapPairs(ListNode head, ListNode expected) {
        ListNode result = swapPairs.swapPairs(head);
        boolean matched = CompareListUtil.compareList(expected,result);
        Assertions.assertTrue(matched);
    }

    static Stream<Arguments> data(){
        ListNode head = ListNodeBuilder.build(1,2,3,4);
        ListNode expected = ListNodeBuilder.build(2,1,4,3);
        ListNode head1 = ListNodeBuilder.build(1);
        ListNode expected1 = ListNodeBuilder.build(1);
        return Stream.of(
                Arguments.arguments(head,expected),
                Arguments.arguments(head1,expected1)
        );
    }

}
