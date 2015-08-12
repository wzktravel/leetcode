package solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzk on 15/7/4.
 */
public class PalindromeNumberTest {

    static List<Integer> list = new ArrayList();
    static {
        list.add(0);
        list.add(-1);
        list.add(1234);
        list.add(12314);
        list.add(1);
        list.add(10);
        list.add(101);
        list.add(12021);
        list.add(1201);
        list.add(1231241251);
        list.add(9090909);
        list.add(909909);
        list.add(1000021);
    }


    @Test
    public void test() {
        PalindromeNumber pn = new PalindromeNumber();
        for (Integer x : list) {
            System.out.println("x: " + x + ", is: " + pn.isPalindrome(x));
        }
    }

    public int test1(int a) {
        int x = 1;
        while (a / (Math.pow(10, x)) > 1) {
            x++;
        }
        return x;
    }

    @Test
    public void test2() {
        int a = 1000021;
        int n = test1(a);
        while (a > 10) {
            System.out.println(n);
            int l = a / (int)Math.pow(10, (n - 1));
            int r = a % 10;
            System.out.println(" l = " + l + ", r = " + r);
            if (l != r) {
                return;
            }
            a = (a % (int)Math.pow(10, (n -1 ))) / 10 ;
            System.out.println(a);
            n-=2;
        }

    }
}
