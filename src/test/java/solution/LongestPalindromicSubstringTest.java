package solution;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by wzk on 15/3/6.
 */
public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

    @Test
    public void testCheckPalindromic() {
        Map<String, Integer> m = Maps.newHashMap();
        m.put(null, 0);
        m.put("", 0);
        m.put("a", 1);
        m.put("ab", 0);
        m.put("abc", 0);
        m.put("aba", 3);
        m.put("abab", 0);
        m.put("ababa", 5);
        m.put("abba", 4);

        Iterator<String> iterator = m.keySet().iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            int l = lps.checkPalindromic(s, 0, s.length() - 1);
            assert(l == m.get(s));
        }

    }

    @Test
    public void testGetMaxLength() {
        Map<String, String> m = Maps.newHashMap();
        m.put(null, "");
        m.put("", "");
        m.put("a", "a");
        m.put("aa", "aa");
        m.put("ab", "a");
        m.put("ccd", "cc");
        m.put("cdd", "dd");
        m.put("aaa", "aaa");
        m.put("aba", "aba");
        m.put("aaabb", "aaa");
        m.put("aabbb", "bbb");
        m.put("abba", "abba");
        m.put("abbab", "abba");
        m.put("abbabbab", "abbabba");
        m.put("aaaaaaaa", "aaaaaaaa");
        m.put("abbbacca", "abbba");

        Iterator<String> iterator = m.keySet().iterator();
        while (iterator.hasNext()) {
            String k = iterator.next();
            String v = lps.longestPalindrome2(k);
            System.out.println("string = " + k + ", result = " + v + " , expected = " + m.get(k));
            assert(v.equals(m.get(k)));
        }

    }

}
