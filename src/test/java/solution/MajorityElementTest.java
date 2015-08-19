package solution;

import org.junit.Test;

/**
 * Created by wzk on 15/8/20.
 */
public class MajorityElementTest {

    int[] nums = new int[]{3, 1, 3};

    @Test
    public void test() {
        MajorityElement me = new MajorityElement();

        int ele = me.majorityElement(nums);
        System.out.println(ele);
    }
}
