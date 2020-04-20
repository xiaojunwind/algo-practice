package cn.forxiao.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

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
            @ConvertWith(String2int.class) int[] nums,
            @ConvertWith(String2int.class) int[] expect
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
            @ConvertWith(String2int.class) int[] nums,
            @ConvertWith(String2int.class) int[] expect
    ) {
        MoveZeroDay moveZeroDay = new MoveZeroDay();
        moveZeroDay.moveZeroSwap(nums);
        assertArrayEquals(expect, nums);
    }

    static class String2int implements ArgumentConverter {
        @Override
        public Object convert(Object source, ParameterContext context)
                throws ArgumentConversionException {
            try {
                String str = (String) source;
                str = str.trim().substring(1, str.length() - 1).trim();
                if (str.isEmpty()) return new int[]{};
                if (!str.contains(",")) return new int[]{Integer.parseInt(str)};
                return Arrays.stream(str.split(","))
                        .map(String::trim)
                        .mapToInt(Integer::parseInt).toArray();
            } catch (ClassCastException e) {
                throw new ArgumentConversionException("The source is not a String", e);
            } catch (NumberFormatException e) {
                throw new ArgumentConversionException("Some content in source is not int", e);
            }
        }
    }
}
