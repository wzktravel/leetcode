package solution2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangzhengkun on 2015/7/5.
 */
public class ThreeSumTest {

    static List<int[]> list = new ArrayList<int[]>();
    static {
//        list.add(null);
//        list.add(new int[]{});
        list.add(new int[]{-1, 0, 1, 2, -1, -4});
//        list.add(new int[]{1, 2, 3, 4});
//        list.add(new int[]{4, 3, 2, 1});
//        list.add(new int[]{1, 3, 2, 4});
//        list.add(new int[]{1, 4, 2, 3});
//        list.add(new int[]{1, 4, 2, 3, 2, 3, 6, 5});
//        list.add(new int[]{0, 4, 2, -1, 2, 3, 6, 5});
    }

    @Test
    public void test() {
        ThreeSum ts = new ThreeSum();
        for (int[] a : list) {
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

}
