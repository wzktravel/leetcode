package solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzhengkun on 2015/7/4.
 */
public class ContainerWithMostWaterTest {

    static List<int []> list = new ArrayList<int[]>();
    static {
        int[] a = new int[]{1, 5, 2, 3, 10, 100};
        list.add(a);
        a = null;
        list.add(a);
        a = new int[]{1};
        list.add(a);
        a = new int[]{1, 0};
        list.add(a);
        a = new int[]{1, 2};
        list.add(a);
        a = new int[]{1, 2, 3};
        list.add(a);
        a = new int[]{4, 10, 5, 7, 3};
        list.add(a);
    }

    @Test
    public void test() {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        for (int[] x : list) {
            System.out.println(cwmw.maxArea(x));
        }
    }

}
