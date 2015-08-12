package solution;

/**
 * Created by wzk on 15/3/3.
 */
public class LongestPalindromicSubstring {

    /**
     * 1. 前N/2个字符放入栈中，一个一个往外取
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String ss = "";
        int maxLen = 0, tmpLen = 0, fi = 0, li = s.length() - 1;
        while (fi < li) {
            tmpLen = checkPalindromic(s, fi, li);
            maxLen = maxLen > tmpLen ? maxLen : tmpLen;
            fi++;
        }
        fi = 0;
        while (fi < li) {
            tmpLen = checkPalindromic(s, fi, li);
            maxLen = maxLen > tmpLen ? maxLen : tmpLen;
            li--;
        }

        return ss;
    }

    public String longestPalindrome2(String s) {
        if (s == null || s.length() <= 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            } else {
                return s.substring(0, 1);
            }
        }
        int i = 0;
        String ss = "";
        while (i < s.length()) {
            String sss = getMaxLength(s, i);
            ss = ss.length() > sss.length() ? ss : sss;
            i++;
        }
        return ss;
    }

    public String getMaxLength(String s, final int index) {
        if (index == 0 || index == s.length() - 1) {
            return s.substring(index, index + 1);
        }
        int li = index - 1, ri = index + 1;

        while (li >= 0 && ri <= s.length() - 1 && s.charAt(li) == s.charAt(ri)) {
            li--; ri++;
        }
        li++; ri--;
        String s1 = s.substring(li, ri+1);

        li = index - 1; ri = index + 1;
        if (ri <= s.length() - 1 && s.charAt(index) == s.charAt(ri)) {
            li = index;
        } else if (li >= 0 && s.charAt(li) == s.charAt(index)) {
            ri = index;
        }
        while (li >= 0 && ri <= s.length() - 1 && s.charAt(li) == s.charAt(ri)) {
            li--; ri++;
        }
        li++; ri--;
        String s2 = s.substring(li, ri+1);
        return s1.length() >= s2.length() ? s1 : s2;
    }

    public int checkPalindromic(String s, int fi, int li) {
        if (s == null || s.length() <= 0 || fi >= li) {
            return 0;
        }
        while (fi < li) {
            if (s.charAt(fi) != s.charAt(li)) {
                return 0;
            }
            fi++; li--;
        }
        return (li - fi + 1);
    }

}
