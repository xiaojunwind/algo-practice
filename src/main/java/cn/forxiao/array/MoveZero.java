package cn.forxiao.array;

import java.util.Arrays;

/**
 * @Description 283.移动零  https://leetcode-cn.com/problems/move-zeroes/
 * @Author xiaojun
 * @Date 2020/4/8 22:20
 **/
public class MoveZero {
    public int[] moveZero(int[] nums) {
        // 如果数组元素不为0，则将该值直接从数组开始替换，并记录下替换下标
        int zeroEndIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeroEndIndex++] = nums[i];
            }
        }
        // 替换完成后，剩下的值为0
        for (int i = zeroEndIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public int[] moveZero1(int[] nums) {
        // 遍历数组，i>zeroIndex
        int zeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != zeroIndex) {
                    if (nums[zeroIndex] == 0) {
                        nums[zeroIndex] = nums[i];
                        nums[i] = 0;
                    }
                    zeroIndex++;
                }
            }

        }
        return nums;
    }

    public int[] moveZeroes(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return nums;
        }

        int notZero = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                swap(nums, notZero, i);
                notZero++;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int notZero, int index) {
        int temp = nums[notZero];
        nums[notZero] = nums[index];
        nums[index] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(nums));
        new MoveZero().moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }
}
