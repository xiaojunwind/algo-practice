package cn.forxiao.array;

import cn.forxiao.util.String2Int;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @Description 测试移动零周复习
 * @Author xiaojun
 * @Date 2020/4/27 22:29
 **/
public class MoveZeroWeekTest {

    private MoveZeroWeek moveZeroWeek;

    @BeforeEach
    void initInstance() {
        moveZeroWeek = new MoveZeroWeek();
    }

    @ParameterizedTest
    @CsvSource({
            "'[0, 1, 0, 3, 12]','[1,3,12,0,0]'",
            "'[0, 0, 0, 0, 0]','[0, 0, 0, 0, 0]'",
            "'[3, 1, 4, 3, 12]','[3, 1, 4, 3, 12]'",
            "'[0, 5, 0, 3, 1, 3, 0, 0, 0, 0, 0, 12]','[5,3,1,3,12,0,0,0,0,0,0,0]'"
    })
    void testTraverseMoveZero(@ConvertWith(String2Int.class) int[] nums, @ConvertWith(String2Int.class) int[] expected) {
        moveZeroWeek.traverseMoveZero(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @ParameterizedTest
    @CsvSource({
            "'[0, 1, 0, 3, 12]','[1,3,12,0,0]'",
            "'[0, 0, 0, 0, 0]','[0, 0, 0, 0, 0]'",
            "'[3, 1, 4, 3, 12]','[3, 1, 4, 3, 12]'",
            "'[0, 5, 0, 3, 1, 3, 0, 0, 0, 0, 0, 12]','[5,3,1,3,12,0,0,0,0,0,0,0]'"
    })
    void testSwapMoveZero(@ConvertWith(String2Int.class) int[] nums, @ConvertWith(String2Int.class) int[] expected) {
        moveZeroWeek.swapMoveZero(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

}
