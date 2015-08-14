package solution;

import java.util.HashSet;

/**
 * 1. 使用hashset
 * 2. 异或操作
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int a : nums) {
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }
        return set.iterator().next();
    }

    public int singleNumber2(int[] nums) {
        int res = 0;
        for (int a : nums) {
            res = res ^ a;
        }
        return res;
    }

}
