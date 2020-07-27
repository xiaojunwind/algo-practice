package cn.forxiao.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @Description 测试两数之和隔天
 * @Author xiaojun
 * @Date 2020/7/28 1:42
 **/
public class TwoSumDayTest {

    private TwoSumDay twoSumDay;

    @BeforeEach
    void init() {
        twoSumDay = new TwoSumDay();
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void testTraversalTwoSum(int[] nums, int target, int[] expected) {
        int[] result = twoSumDay.traversalTwoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void testHashTwoSum(int[] nums, int target, int[] expected) {
        int[] result = twoSumDay.hashTwoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 7, 11, 15, 12}, 9, new int[]{0, 1}),
                Arguments.arguments(new int[]{2, 7, 11, 15, 12}, 18, new int[]{1, 2})
        );
    }

}
