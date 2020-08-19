package cn.forxiao.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 两数之和周复习
 * @Author xiaojun
 * @Date 2020/8/20 6:01
 **/
public class TwoSumWeek {

    public int[] traversalTwoSum(int[] nums, int target) {
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] hashTwoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (intMap.containsKey(complement) && intMap.get(complement) != i) {
                    return new int[]{intMap.get(complement), i};
                }
                intMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
