package cn.forxiao.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 两数之和隔天复习
 * @Author xiaojun
 * @Date 2020/7/28 1:17
 **/
public class TwoSumDay {

    public int[] traversalTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] hashTwoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indexMap.containsKey(complement) && indexMap.get(complement) != i) {
                return new int[]{indexMap.get(complement), i};
            }
            indexMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

}
