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
 * @author xiaojun
 * @description K个一组翻转链表测试
 * @date 2020-11-27 03:41
 **/
public class ReverseKGroupListTest {

    private ReverseKGroupList reverseKGroupList;

    @BeforeEach
    void init(){
        reverseKGroupList = new ReverseKGroupList();
    }

    @ParameterizedTest
    @MethodSource("dataProvide")
    public void testReverseKGroupList(ListNode head,int k,ListNode expected){
        ListNode result = reverseKGroupList.reverseKGroup(head,k);
        boolean matched = CompareListUtil.compareList(expected,result);
        Assertions.assertTrue(matched);
    }

    static Stream<Arguments> dataProvide() {
        ListNode head = ListNodeBuilder.build(1,2,3,4,5);
        ListNode expected = ListNodeBuilder.build(3,2,1,4,5);
        ListNode head1 = ListNodeBuilder.build(1);
        ListNode expected1 = ListNodeBuilder.build(1);
        return Stream.of(
                Arguments.arguments(head,3,expected),
                Arguments.arguments(head1,1,expected1)
        );
    }

}
