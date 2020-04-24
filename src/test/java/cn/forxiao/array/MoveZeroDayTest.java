package cn.forxiao.array;

import cn.forxiao.util.String2Int;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @Description 移动零测试
 * @Author xiaojun
 * @Date 2020/4/20 22:25
 **/
public class MoveZeroDayTest {

    @DisplayName("测试填充方法")
    @ParameterizedTest
    @CsvSource({
            "'[0, 1, 0, 3, 12]','[1,3,12,0,0]'",
            "'[0, 0, 0, 0, 0]','[0, 0, 0, 0, 0]'",
            "'[3, 1, 4, 3, 12]','[3, 1, 4, 3, 12]'",
            "'[0, 5, 0, 3, 1, 3, 0, 0, 0, 0, 0, 12]','[5,3,1,3,12,0,0,0,0,0,0,0]'"
    })
    void testMoveZeroFilling(
            @ConvertWith(String2Int.class) int[] nums,
            @ConvertWith(String2Int.class) int[] expect
    ) {
        MoveZeroDay moveZeroDay = new MoveZeroDay();
        moveZeroDay.moveZeroFilling(nums);
        assertArrayEquals(expect, nums);
    }

    @DisplayName("测试交换方法")
    @ParameterizedTest
    @CsvSource({
            "'[0, 1, 0, 3, 12]','[1, 3, 12, 0, 0]'",
            "'[0, 0, 0, 0, 0]','[0, 0, 0, 0, 0]'",
            "'[3, 1, 4, 3, 12]','[3, 1, 4, 3, 12]'",
            "'[0, 5, 0, 3, 1, 3, 0, 0, 0, 0, 0, 12]','[5, 3, 1, 3, 12, 0, 0, 0, 0, 0, 0, 0]'"
    })
    void testMoveZeroSwap(
            @ConvertWith(String2Int.class) int[] nums,
            @ConvertWith(String2Int.class) int[] expect
    ) {
        MoveZeroDay moveZeroDay = new MoveZeroDay();
        moveZeroDay.moveZeroSwap(nums);
        assertArrayEquals(expect, nums);
    }

}
