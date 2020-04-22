package cn.forxiao.array;

/**
 *
 * @Description 11.  https://leetcode-cn.com/problems/container-with-most-water/
 * @author xiaojun
 * @Date 2020/4/22
 **/
public class MaxArea {

    public int maxArea(int[] height) {
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

}
