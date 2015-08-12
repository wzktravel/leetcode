package solution;

/**
 * Created by wzk on 15/7/4.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs[0] == null || strs.length < 1) {
            return "";
        }
        StringBuilder ss = new StringBuilder();

        char c, d;
        for (int i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j] == null || strs[j].length() < i+1) {
                    return ss.toString();
                }
                d = strs[j].charAt(i);
                if (c != d) {
                    return ss.toString();
                }
            }
            ss.append(c);
        }

        return ss.toString();
    }

}
