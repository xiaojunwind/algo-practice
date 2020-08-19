package cn.forxiao.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @Description 两数之和周复习测试
 * @Author xiaojun
 * @Date 2020/8/20 6:11
 **/
public class TwoSumWeekTest {

    private TwoSumWeek twoSumWeek;

    @BeforeEach
    void init(){
        twoSumWeek = new TwoSumWeek();
    }

    @ParameterizedTest
    @MethodSource("getProvideData")
    void testTraversalTwoSum(int[] nums,int target,int[] expected){
        int[] result = twoSumWeek.traversalTwoSum(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("getProvideData")
    void testHashTwoSum(int[] nums,int target,int[] expected) {
        int[] result = twoSumWeek.hashTwoSum(nums, target);
        Assertions.assertArrayEquals(expected,result);
    }

    static Stream<Arguments> getProvideData(){
        return Stream.of(
                Arguments.arguments(new int[]{2,5,7,9,11},9,new int[]{0,2})
        );
    }
}
