package solution;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by wangzhengkun on 2015/8/17.
 */
public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }


    public boolean containsDuplicate2(int[] nums) {
        if (nums == null || nums.length <= 1) return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

}
