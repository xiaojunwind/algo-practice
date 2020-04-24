package cn.forxiao.array;

import cn.forxiao.util.String2Int;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @Description 测试盛水的容器隔天复习
 * @Author xiaojun
 * @Date 2020/4/24 23:20
 **/
public class MaxAreaDayTest {

    private MaxAreaDay maxArea;

    @BeforeEach
    void initEnv() {
        maxArea = new MaxAreaDay();
    }

    @DisplayName("测试暴力法")
    @ParameterizedTest
    @CsvSource("'[1,8,6,2,5,4,8,3,7]',49")
    void testTraverseMaxArea(@ConvertWith(String2Int.class) int[] height, int expected) {
        int maxAreaResult = maxArea.traverseMaxArea(height);
        Assertions.assertEquals(expected, maxAreaResult);
    }

    @DisplayName("测试左右逼近法")
    @ParameterizedTest
    @CsvSource("'[1,8,6,2,5,4,8,3,7]',49")
    void testClosedMaxArea(@ConvertWith(String2Int.class) int[] height, int expected) {
        int maxAreaResult = maxArea.closedMaxArea(height);
        Assertions.assertEquals(expected, maxAreaResult);
    }

}
