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
 * @Description 三数之和测试
 * @Author xiaojun
 * @Date 2020/6/29 21:58
 **/
public class ThreeSumTest {

    private ThreeSum threeSum;

    @BeforeEach
    void init(){
        threeSum = new ThreeSum();
    }

    @ParameterizedTest
    @MethodSource("dataProvide")
    void testTraversalThreeSum(int[] nums,String expected){
        List<List<Integer>> result = threeSum.traversalThreeSum(nums);
        Assertions.assertEquals(expected, JSON.toJSONString(result));
    }

    static Stream<Arguments> dataProvide(){
        List<Integer> result1 = Arrays.asList(-1, 0, 1);
        List<Integer> result2 = Arrays.asList(-1, 2, -1);
        List<List<Integer>> result = Arrays.asList(result1,result2);

        return Stream.of(
                Arguments.arguments(new int[]{-1, 0, 1, 2, -1, -4}, JSON.toJSONString(result))
//                ,
//                Arguments.arguments(new int[]{2, 7, 11, 15, 12}, 18, new int[]{1, 2})
        );
    }

}
