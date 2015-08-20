package solution;

/**
 * Created by wangzhengkun on 2015/8/20.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        int size = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pre[i] = 1;
                post[size - 1] = 1;
            } else {
                pre[i] = pre[i - 1] * nums[i - 1];
                post[size - i - 1] = post[size - i] * nums[size - i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            pre[i] = pre[i] * post[i];
        }
        return pre;
    }

    public int[] productExceptSelf2(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        int size = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pre[i] = 1;
                post[size - 1] = 1;
            } else {
                pre[i] = pre[i - 1] * nums[i - 1];
                post[size - i - 1] = post[size - i] * nums[size - i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            pre[i] = pre[i] * post[i];
        }
        return pre;
    }

}
