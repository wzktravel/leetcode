package solution;

import org.junit.Test;

/**
 * Created by wangzhengkun on 2015/8/20.
 */
public class ProductOfArrayExceptSelfTest {

    int[] a = new int[]{1, 2, 3, 4};

    @Test
    public void test() {
        ProductOfArrayExceptSelf ps = new ProductOfArrayExceptSelf();

        int[] b = ps.productExceptSelf(a);

        for (int x : b) {
            System.out.println(x);
        }
    }

}
