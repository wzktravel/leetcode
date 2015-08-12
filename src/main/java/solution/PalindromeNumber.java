package solution;

/**
 * Created by wzk on 15/7/4.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int n = 1;
        while (x / (Math.pow(10, (n))) >= 1) {
            n++;
        }
        int a = 1;
        while (a <= n / 2) {
            int l = (x / (int)Math.pow(10, (n-a))) % 10;
            int r = (x % (int)Math.pow(10, a)) / (int)Math.pow(10, (a-1));
            if (l != r) {
                return false;
            }
            a++;
        }
        return true;
    }

}
