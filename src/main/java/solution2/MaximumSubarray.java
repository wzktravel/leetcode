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
        System.out.println(i + " " + j);
        if (i >= j) {
            res = nums[0];
            for (i = 0; i < nums.length; i++) {
                res = Math.max(nums[i], res);
            }
        } else {
            int tmp = 0;
            int last = nums[i];
            for (; i <= j; i++) {
                if (nums[i] > 0) {
                    tmp = nums[i];
                } else {
                    tmp += nums[i];
                }
                if (last < 0 && tmp > 0) {
                    res += tmp;
                }
                last = nums[i];
                System.out.println(i + ", " + tmp + ", " + res);
            }
        }
        return res;
    }

}
