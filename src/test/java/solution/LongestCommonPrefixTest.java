package solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzk on 15/7/4.
 */
public class LongestCommonPrefixTest {

    static List<String[]> list = new ArrayList();
    static {
        list.add(new String[]{"a", "aa", "ab"});
        list.add(new String[]{"a", "aa", "aeeeee"});
        list.add(new String[]{"", "aa", ""});
        list.add(new String[]{null, "aa", ""});
        list.add(new String[]{"aaaacs", "aa", "aaaaaaa"});
        list.add(new String[]{"acs", "ba", "dew"});
        list.add(new String[]{"dcs", null, "dew"});
    }


    @Test
    public void test() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        for (String[] a : list) {
            System.out.println(lcp.longestCommonPrefix(a));
        }
    }


}
