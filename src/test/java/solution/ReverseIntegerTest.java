package solution;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by wzk on 15/3/7.
 */
public class ReverseIntegerTest {

    ReverseInteger ri = new ReverseInteger();

    @Test
    public void test() {

        Map<Integer, Integer> m = Maps.newHashMap();
        m.put(0, 0);
        m.put(123, 321);
        m.put(-123, -321);
        m.put(100, 1);
        m.put(1000000003, 0);

        Iterator<Integer> it = m.keySet().iterator();
        while (it.hasNext()) {
            int input = it.next();
            int output = ri.reverse2(input);
            assert(output == m.get(input));
        }

    }

}
