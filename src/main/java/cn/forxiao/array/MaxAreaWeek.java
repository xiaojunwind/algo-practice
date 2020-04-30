package cn.forxiao.array;

/**
 * @Description 盛水的容器周复习
 * @Author xiaojun
 * @Date 2020/4/30 22:18
 **/
public class MaxAreaWeek {

    public int traverseMaxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length;j++) {
                int area = Math.min(height[i],height[j]) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public int closedMaxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        while (leftIndex < rightIndex){
           int area = Math.min(height[leftIndex],height[rightIndex]) * (rightIndex - leftIndex);
           maxArea = Math.max(maxArea, area);
           if (height[leftIndex] < height[rightIndex]){
               leftIndex++;
           }else {
               rightIndex--;
           }
        }
        return maxArea;
    }

}
