package cn.forxiao.array;

/**
 * @author xiaojun
 * @Description 11.  https://leetcode-cn.com/problems/container-with-most-water/
 * @Date 2020/4/22
 **/
public class MaxArea {

    public int traverseMaxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                int high = height[i];
                if (high > height[j]) {
                    high = height[j];
                }
                int area = high * (j - i);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int closedMaxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left],height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
