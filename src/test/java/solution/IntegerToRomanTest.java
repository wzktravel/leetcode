package solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzk on 15/7/4.
 */
public class IntegerToRomanTest {

    static List<Integer> list = new ArrayList<Integer>();
    static {
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(14);
        list.add(15);
    }

    @Test
    public void test() {
        IntegerToRoman itr = new IntegerToRoman();
        for (int i : list) {
            System.out.println(itr.intToRoman(i));
        }
    }

}
