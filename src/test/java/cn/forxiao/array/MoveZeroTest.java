package cn.forxiao.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/**
 * @Description 移动零测试类
 * @Author xiaojun
 * @Date 2020/4/19 21:52
 **/
public class MoveZeroTest {

//    private int[] nums;

    @BeforeEach
    void initData(){
//        nums = new int[]{0, 1, 0, 3, 12};
    }

    @Test
    void testMoveZero(){
        MoveZero moveZero = new MoveZero();
        int [] nums = moveZero.moveZero1(new int[]{0, 1, 0, 3, 12});
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
        int [] nums1 = moveZero.moveZero1(new int[]{0, 0, 0, 0, 0});
        assertArrayEquals(new int[]{0,0,0,0,0}, nums1);
        int [] nums2 = moveZero.moveZero1(new int[]{3, 1, 4, 3, 12});
        assertArrayEquals(new int[]{3,1,4,3,12}, nums2);
        int [] nums3 = moveZero.moveZero1(new int[]{0, 5, 0, 3, 1, 3, 0, 0, 0, 0, 0, 12});
        assertArrayEquals(new int[]{5,3,1,3,12,0,0,0,0,0,0,0}, nums3);
    }

    @Test
    void testMoveZeros(){
        MoveZero moveZero = new MoveZero();
        int [] nums = moveZero.moveZeroes(new int[]{0, 1, 0, 3, 12});
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
        int [] nums1 = moveZero.moveZeroes(new int[]{0, 0, 0, 0, 0});
        assertArrayEquals(new int[]{0,0,0,0,0}, nums1);
        int [] nums2 = moveZero.moveZeroes(new int[]{3, 1, 4, 3, 12});
        assertArrayEquals(new int[]{3,1,4,3,12}, nums2);
        int [] nums3 = moveZero.moveZeroes(new int[]{0, 5, 0, 3, 1, 3, 0, 0, 0, 0, 0, 12});
        assertArrayEquals(new int[]{5,3,1,3,12,0,0,0,0,0,0,0}, nums3);
    }


}
