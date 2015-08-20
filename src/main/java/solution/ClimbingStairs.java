package solution;

/**
 * Created by wangzhengkun on 2015/8/20.
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int pre = 1;
        int change = 1;
        int res = 1;

        for (int i = 2; i <= n; i++) {
            change = res;
            res = res + pre;
            pre = change;
        }

        return res;
    }

    public int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs2(n - 1) + climbStairs2(n - 2);
    }

}
