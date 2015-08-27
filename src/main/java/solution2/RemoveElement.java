package solution2;

/**
 * Created by wangzhengkun on 2015/8/27.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {

            } else {
                res++;
                nums[res - 1] = nums[i];
            }
        }
        return res;
    }


    void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
