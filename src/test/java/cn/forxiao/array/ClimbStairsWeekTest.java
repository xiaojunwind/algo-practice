package cn.forxiao.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @Description 测试爬楼梯周复习
 * @Author xiaojun
 * @Date 2020/6/23 00:02
 **/
public class ClimbStairsWeekTest {

    private ClimbStairsWeek climbStairsWeek;

    @BeforeEach
    void initInstance() {
        climbStairsWeek = new ClimbStairsWeek();
    }

    @ParameterizedTest
    @CsvSource({"2,2","3,3","4,5","5,8"})
    void testRecursiveClimbStairsWeek(int n,int expected){
        int result = climbStairsWeek.recursiveClimbStairs(n);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"2,2","3,3","4,5","5,8"})
    void testBetterClimbStairsWeek(int n, int expected) {
        int result = climbStairsWeek.betterClimbStairs(n);
        Assertions.assertEquals(expected,result);
    }
}
