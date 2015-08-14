package solution;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangzhengkun on 2015/8/14.
 */
public class SingleNumberTest {

    Map<int[], Integer> map = new HashMap();

    @Before
    public void before() {
        map.put(new int[]{1, 2, 2}, 1);
        map.put(new int[]{2, 1, 2}, 1);
        map.put(new int[]{2, 2, 1}, 1);
        map.put(new int[]{1, 2, 2, 4, 5, 5, 4}, 1);
        map.put(new int[]{2, 2, 1020, 4, 5, 5, 4}, 1020);
        map.put(new int[]{1}, 1);
        map.put(new int[]{4}, 4);
    }

    @Test
    public void test() {
        SingleNumber sn = new SingleNumber();
        for (int[] ss : map.keySet()) {
            assert(sn.singleNumber2(ss) == map.get(ss));
        }

    }

    @Test
    public void test1() {
        int a = 11;
        int b = 3;
        int c = 11;

        int q = a ^ b ^ c;
        System.out.println(q);
    }

}
