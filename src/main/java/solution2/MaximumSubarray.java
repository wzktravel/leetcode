package solution2;

/**
 * Created by wangzhengkun on 2015/8/20.
 */
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int res = 0;

        int i = 0, j = nums.length - 1;
        while(i < j && (nums[i] <= 0 || nums[j] <= 0)) {
            if (nums[i] <= 0) {
                i++;
            }
            if (nums[j] <= 0) {
                j--;
            }
        }
        if (i >= j) {
            res = nums[0];
            for (i = 0; i < nums.length; i++) {
                res = Math.max(nums[i], res);
            }
        } else {
            int tmp = nums[i];
            for (; i < j; i++) {
                if (nums[i] > 0) {
                    if (tmp > 0) {
                        res += tmp;
                    }
                    tmp = nums[i];
                } else {
                    tmp += nums[i];
                }
            }
        }
        return res;
    }

}
