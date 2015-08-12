package solution;

/**
 * Created by wzk on 15/3/7.
 */
public class StringToInteger {

    public int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            char si = str.charAt(i);
            if (!((si >= '0' && si <= '9') || si == '-' || si == '+')) {
                return -1;
            }
        }
        int res = 0;

        return res;
    }

}
