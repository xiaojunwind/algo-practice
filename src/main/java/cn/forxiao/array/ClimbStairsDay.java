package cn.forxiao.array;

/**
 * @Description 爬楼梯隔天复习
 * @Author xiaojun
 * @Date 2020/4/27 22:35
 **/
public class ClimbStairsDay {

    public int recursiveClimbStairs(int n) {
        return climbStairs(0,n);
    }

    private int climbStairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n){
            return 1;
        }
        return climbStairs(i+1, n) + climbStairs(i + 2, n);
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
