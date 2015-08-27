package solution2;

/**
 * Created by wangzhengkun on 2015/8/27.
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }
        int hl = haystack.length(), nl = needle.length();
        if (hl < nl) {
            return -1;
        }

        char targetFirstChar = needle.charAt(0);
        for (int i = 0; i < hl; i++) {
            if (targetFirstChar != haystack.charAt(i)) {
                while (++i <= (hl - nl) && haystack.charAt(i) != targetFirstChar) ;
            }
            if (i <= (hl - nl)) {
                int j = i + 1, k = 1;
                for (; j < hl && k < nl && haystack.charAt(j) == needle.charAt(k); j++, k++);
                if (k == nl) {
                    return i;
                }
            }
        }

        return -1;
    }

}
