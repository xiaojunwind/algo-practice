package cn.forxiao.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @Description 测试爬楼梯
 * @Author xiaojun
 * @Date 2020/4/25 21:56
 **/
public class ClimbStairsTest {

    private ClimbStairs climbStairs;

    @BeforeEach
    void initInstance(){
        climbStairs = new ClimbStairs();
    }

    @ParameterizedTest
    @CsvSource({"3,3","4,5","5,8"})
    void testRecursiveClimbStairs(int n, int expected){
        int result = climbStairs.recursiveClimbStairs(n);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"3,3","4,5","5,8"})
    void testBetterClimbStairs(int n, int expected){
        int result = climbStairs.betterClimbStairs(n);
        Assertions.assertEquals(expected, result);
    }

}
