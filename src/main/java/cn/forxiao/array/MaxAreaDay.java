package cn.forxiao.array;

/**
 * @Description 11.盛水的容器
 * @Author xiaojun
 * @Date 2020/4/24 23:07
 **/
public class MaxAreaDay {

    public int traverseMaxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, computeMaxArea(height, i, j));
            }
        }
        return maxArea;
    }

    private int computeMaxArea(int[] height, int leftIndex, int rightIndex) {
        return Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex);
    }

    public int closedMaxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        while (rightIndex > leftIndex) {
            maxArea = Math.max(maxArea, computeMaxArea(height, leftIndex, rightIndex));
            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return maxArea;
    }
}
