package solution2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by wzk on 15/8/21.
 */
public class ValidParenthesesTest {

    HashMap<String, Boolean> map = new HashMap();

    @Before
    public void before() {
        map.put("()", true);
        map.put("[]", true);
        map.put("{}", true);
        map.put("(){}", true);
        map.put("([]){}", true);
        map.put("{([])}{}", true);

        map.put("([])}{}", false);
        map.put("(}", false);
        map.put("[(])", false);

        map.put(")}{({))[{{[}", false);
        map.put("((", false);

    }

    @Test
    public void test() {

        ValidParentheses vp = new ValidParentheses();

        for (String key : map.keySet()) {
            assert(vp.isValid(key) == map.get(key));
        }

    }

}
