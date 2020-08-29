package cn.forxiao.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 三数之和隔周复习
 * @Author xiaojun
 * @Date 2020/8/30 5:56
 */
public class ThreeSumWeek {

    List<List<Integer>> traversalThreeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0){
                            result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }
        distinct(result);
        return result;
    }

    private void distinct(List<List<Integer>> lists) {
        if (lists.isEmpty()) return;
        List<List<Integer>> repeated = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            if (repeated.contains(lists.get(i))) continue;
            for (int j = i + 1; j < lists.size(); j++) {
                if (repeated.contains(lists.get(j))) continue;
                boolean isEquals = compareListValue(lists.get(i),lists.get(j));
                if (isEquals) repeated.add(lists.get(j));
            }
        }

        if (!repeated.isEmpty()) {
            for (List<Integer> indexList : repeated) {
                lists.remove(indexList);
            }
        }
    }

    private boolean compareListValue(List<Integer> listOne, List<Integer> listTwo) {
        if (listOne.isEmpty() || listTwo.isEmpty()) {
            return false;
        }

        for (Integer index : listTwo) {
            if (!listOne.contains(index)) {
                return false;
            }
        }

        return true;
    }

    List<List<Integer>> doublePointerThreeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length >= 3) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

}
