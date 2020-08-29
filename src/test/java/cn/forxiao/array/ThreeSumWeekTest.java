package cn.forxiao.array;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description 三数之和隔周测试
 * @Author xiaojun
 * @Date 2020/8/30 06:44
 */
public class ThreeSumWeekTest {

    private ThreeSumWeek threeSumWeek;

    @BeforeEach
    void init(){
        threeSumWeek = new ThreeSumWeek();
    }

    @ParameterizedTest
    @MethodSource("getProvideData")
    void testTraversalThreeSum(int[] nums,String expected) {
        List<List<Integer>> result = threeSumWeek.traversalThreeSum(nums);
        Assertions.assertEquals(expected,JSON.toJSONString(result));
    }

    @ParameterizedTest
    @MethodSource("getProvideData2")
    void testDoublePointerThreeSum(int[] nums,String expected) {
        List<List<Integer>> result = threeSumWeek.doublePointerThreeSum(nums);
        Assertions.assertEquals(expected,JSON.toJSONString(result));
    }

    static Stream<Arguments> getProvideData(){

        List<Integer> result1 = Arrays.asList(-1, 0, 1);
        List<Integer> result2 = Arrays.asList(-1, 2, -1);
        List<List<Integer>> result = Arrays.asList(result1, result2);
        return Stream.of(
                Arguments.arguments(new int[]{-1, 0, 1, 2, -1, -4}, JSON.toJSONString(result))
        );
    }

    static Stream<Arguments> getProvideData2() {
        List<Integer> result1 = Arrays.asList(-1, -1, 2);
        List<Integer> result2 = Arrays.asList(-1, 0, 1);
        List<List<Integer>> result = Arrays.asList(result1, result2);
        return Stream.of(
                Arguments.arguments(new int[]{-1, 0, 1, 2, -1, -4}, JSON.toJSONString(result))
        );
    }
}
