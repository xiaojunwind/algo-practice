package cn.forxiao.array;

/**
 * @Description 70.爬楼梯 https://leetcode-cn.com/problems/climbing-stairs/
 * @Author xiaojun
 * @Date 2020/4/25 21:45
 **/
public class ClimbStairs {

    public int recursiveClimbStairs(int n) {
        return climbStairs(0, n);
    }

    private int climbStairs(int cur, int n) {
        if (cur > n) {
            return 0;
        }
        if (cur == n) {
            return 1;
        }
        return climbStairs(cur + 1, n) + climbStairs(cur + 2, n);
    }

    public int betterClimbStairs(int n) {
        if (n <= 2) return n;
        int pre1 = 1;
        int pre2 = 2;
        for (int i = 2; i < n; i++) {
            int cur = pre1 + pre2;
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }

}
