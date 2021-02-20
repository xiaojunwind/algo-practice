package cn.forxiao.list;

import cn.forxiao.list.node.ListNode;
import cn.forxiao.util.ListNodeBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @Description 环形链表测试
 * @Author mufeng
 * @Date 2021/2/21
 **/
public class CycleListTest {

    private CycleList cycleList;

    @BeforeEach
    void init() {
        cycleList = new CycleList();
    }

    @ParameterizedTest
    @MethodSource("dates")
    void testHasCycle(ListNode head, Boolean expected) {
        boolean result = cycleList.hasCycle(head);
        Assertions.assertEquals(expected,result);
    }

    static Stream<Arguments> dates(){
        ListNode head = ListNodeBuilder.buildCycle(0,1,2);
        ListNode head1 = ListNodeBuilder.buildCycle(-1,1);
        return Stream.of(
                Arguments.arguments(head,(Boolean) true),
                Arguments.arguments(head1,(Boolean) false)
        );
    }

}
