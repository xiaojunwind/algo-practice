package cn.forxiao.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description 15.三数之和 https://leetcode-cn.com/problems/3sum/
 * @Author xiaojun
 * @Date 2020/6/27 15:42
 **/
public class ThreeSum {

    public List<List<Integer>> traversalThreeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(Collections.emptyList());
        if (nums.length >= 3){
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        }
                    }
                }
            }
        }
        distinct(result);
        return result;
    }

    private void distinct(List<List<Integer>> result) {
        for (int i = 0; i < result.size(); i++) {
            for (int j = i+1; j < result.size(); j++) {
                List<Integer> resultI = result.get(i);
                List<Integer> resultJ = result.get(j);
                if (resultI.containsAll(resultJ)) {
                    result.remove(j--);
                }
            }
        }
    }

    public List<List<Integer>> doublePointerThreeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length >= 3){
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i-1]) continue;
                int target = -nums[i];
                int left = i + 1,right = nums.length - 1;
                while (left < right){
                    if (nums[left] + nums[right] == target) {
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])left++;
                        while (left < right && nums[right] == nums[right + 1])right--;
                    }else if (nums[left] + nums[right] < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
