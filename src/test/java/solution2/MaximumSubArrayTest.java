package solution2;

import org.junit.Test;

/**
 * Created by wangzhengkun on 2015/8/20.
 */
public class MaximumSubArrayTest {

    int[] a = new int[]{6, -2, -1, -2, 3};

    @Test
    public void test() {
        MaximumSubArray ms = new MaximumSubArray();

        System.out.println(ms.maxSubArray(a));
    }

}
