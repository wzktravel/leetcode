package solution;

import org.junit.Test;

/**
 * Created by wangzhengkun on 2015/8/17.
 */
public class ContainsDuplicateTest {

    int[] nums = new int[]{1, 2, 3, 3};

    @Test
    public void test() {
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }

}
