package solution;

import java.util.HashMap;

/**
 * Created by wzk on 15/8/19.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }
        int half = size / 2 + 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < size; i++) {
            int ele = nums[i];
            if (map.containsKey(ele)) {
                int now = map.get(ele)+1;
                if (now >= half) {
                    return ele;
                }
                map.put(ele, now);
            } else {
                map.put(ele, 1);
            }
        }
        return 0;
    }

}
