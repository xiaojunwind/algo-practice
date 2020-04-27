package cn.forxiao.array;

/**
 * @Description 移动零周复习
 * @Author xiaojun
 * @Date 2020/4/27 22:18
 **/
public class MoveZeroWeek {

    public void traverseMoveZero(int[] nums) {
        if (nums.length < 2) return;
        int moveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[moveIndex++] = nums[i];
            }
        }

        for (int i = moveIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void swapMoveZero(int[] nums) {
        if (nums.length < 2) return;
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swapValue(nums,zeroIndex++,i);
            }
        }
    }

    private void swapValue(int[] nums, int zeroIndex, int numsIndex) {
        int cur = nums[zeroIndex];
        nums[zeroIndex] = nums[numsIndex];
        nums[numsIndex] = cur;
    }

}
