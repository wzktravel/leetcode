package solution;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangzhengkun on 2015/8/17.
 */
public class NumberOfOneBitsTest {

    Map<Integer, Integer> map = new HashMap();

    @Before
    public void before() {
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 1);
        map.put(10, 2);
        map.put(11, 3);
        map.put(12, 2);
    }

    @Test
    public void test() {
        NumberOfOneBits nb = new NumberOfOneBits();
        for (Integer i : map.keySet()) {
//            assertEquals(map.get(i), nb.hammingWeight(i));
            assert(map.get(i) == nb.hammingWeight3(i));
        }
    }

    @Test
    public void test1() {
        int a = (int)Math.pow(2, 32);  //1011

        int r = 0;
        for (int index = 32; index > 0; index--) {
            if ((a & 1) == 1) {
                r++;
            }
            a = a >> 1;
        }

        System.out.println(r);
    }

}
