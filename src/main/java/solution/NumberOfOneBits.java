package solution;

/**
 * Created by wangzhengkun on 2015/8/17.
 */
public class NumberOfOneBits {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int r = 0;
        for (int index = 32; index > 0; index--) {
            if ((n & 1) == 1) {
                r++;
            }
            n = n >> 1;
        }
        return r;
    }

    public int hammingWeight2(int n) {
        n = n - ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n + (n >>> 4)) & 0x0f0f0f0f;
        n = n + (n >>> 8);
        n = n + (n >>> 16);
        return n & 0x3f;
    }

    public int hammingWeight3(int n) {
        int total_ones = 0;
        while (n != 0) {
            n = n & (n-1);
            total_ones++;
        }
        return total_ones;
    }

}
