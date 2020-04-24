package cn.forxiao.array;

import cn.forxiao.util.String2Int;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @Description 测试盛水的容器
 * @Author xiaojun
 * @Date 2020/4/23 23:35
 **/
public class MaxAreaTest {

    private MaxArea maxArea;

    @BeforeEach
    void init() {
        maxArea = new MaxArea();
    }

    @DisplayName("测试遍历方法")
    @ParameterizedTest
    @CsvSource({"'[1,8,6,2,5,4,8,3,7]',49"})
    void testTraverseMaxArea(@ConvertWith(String2Int.class) int[] height, int expected) {
        int result = maxArea.traverseMaxArea(height);
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("测试左右逼近方法")
    @ParameterizedTest
    @CsvSource({"'[1,8,6,2,5,4,8,3,7]',49"})
    void testClosedMaxArea(@ConvertWith(String2Int.class) int[] height, int expected) {
        int result = maxArea.closedMaxArea(height);
        Assertions.assertEquals(expected, result);
    }
}
