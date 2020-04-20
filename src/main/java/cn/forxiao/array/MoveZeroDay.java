package cn.forxiao.array;

/**
 * @Description 移动零隔天复习
 * @Author xiaojun
 * @Date 2020/4/20 22:14
 **/
public class MoveZeroDay {

    public void moveZeroFilling(int[] nums){
        if (nums.length < 2) {
            return;
        }

        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[zeroIndex++] = nums[i];
            }
        }
        for (int i = zeroIndex;i<nums.length;i++){
            nums[i] = 0;
        }

    }

    public void moveZeroSwap(int[] nums){
        if (nums.length < 2) {
            return;
        }
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swapArray(nums,i,zeroIndex);
                zeroIndex++;
            }
        }
    }

    private void swapArray(int[] nums, int i, int zeroIndex) {
        int tmp = nums[zeroIndex];
        nums[zeroIndex] = nums[i];
        nums[i] = tmp;
    }

}
