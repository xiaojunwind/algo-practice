package cn.forxiao.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @Description 测试爬楼梯隔天复习
 * @Author xiaojun
 * @Date 2020/4/27 22:42
 **/
public class ClimbStairsDayTest {

    private ClimbStairsDay climbStairsDay;

    @BeforeEach
    void initInstance() {
        climbStairsDay = new ClimbStairsDay();
    }

    @ParameterizedTest
    @CsvSource({"2,2","3,3","4,5","5,8"})
    void testRecursiveClimbStairsDay(int n,int expected){
        int result = climbStairsDay.recursiveClimbStairs(n);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"2,2","3,3","4,5","5,8"})
    void testBetterClimbStairsDay(int n, int expected) {
        int result = climbStairsDay.betterClimbStairs(n);
        Assertions.assertEquals(expected,result);
    }
}
