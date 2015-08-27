package solution2;

import org.junit.Test;

/**
 * Created by wangzhengkun on 2015/8/27.
 */
public class RemoveDuplicatesFromSortedArrayTest {


    @Test
    public void test() {
        int[] nums = new int[]{1, 1, 2};

        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
        System.out.println(rd.removeDuplicates(nums));

    }

}
