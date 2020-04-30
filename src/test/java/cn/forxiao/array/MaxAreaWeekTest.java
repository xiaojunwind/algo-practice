package cn.forxiao.array;

import cn.forxiao.util.String2Int;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @Description 测试盛水的容器周复习
 * @Author xiaojun
 * @Date 2020/4/30 22:27
 **/
public class MaxAreaWeekTest {

    private MaxAreaWeek maxAreaWeek;

    @BeforeEach
    void initInstance() {
        maxAreaWeek = new MaxAreaWeek();
    }

    @ParameterizedTest
    @CsvSource({"'[1,8,6,2,5,4,8,3,7]',49"})
    void testMaxArea(@ConvertWith(String2Int.class) int[] height, int expected){
        Assertions.assertEquals(expected, maxAreaWeek.traverseMaxArea(height));
        Assertions.assertEquals(expected, maxAreaWeek.closedMaxArea(height));
    }

}
