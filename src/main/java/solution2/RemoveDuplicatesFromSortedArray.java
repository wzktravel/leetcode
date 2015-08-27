package solution2;

/**
 * Created by wangzhengkun on 2015/8/27.
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int res = 1;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tmp != nums[i]) {
                res++;
                tmp = nums[i];
                nums[res - 1] = tmp;
            }
        }

        printArray(nums);

        return res;
    }

    void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
