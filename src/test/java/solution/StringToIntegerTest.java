package solution;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by wzk on 15/3/7.
 */
public class StringToIntegerTest {

    StringToInteger atoi = new StringToInteger();

    @Test
    public void test() {
        Map<String, Integer> m = new HashMap();
        m.put(null, 0);
        m.put("", 0);
        m.put("a", -1);
        m.put("+a", -1);
        m.put("a0", -1);
        m.put("1a", -1);

//        m.put("-1", -1);

        Iterator<String> it = m.keySet().iterator();
        while (it.hasNext()) {
            String input = it.next();
            int expected = m.get(input);
            int output = atoi.atoi(input);
//            assert(output == expected);
            assertEquals(expected, output);
        }

    }

}
