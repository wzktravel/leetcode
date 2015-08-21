package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangzhengkun on 2015/8/21.
 */
public class ThreeSum {

    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return list;
        }

        Arrays.sort(nums);

        int len = nums.length;
        for (int i = 0; i < len-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            find(nums, i+1, len-1, nums[i]);
        }

        return list;
    }

    public void find(int[] num, int begin, int end, int target) {
        int l = begin, r = end;
        while (l < r) {
            if (num[l] + num[r] + target == 0) {
                List<Integer> ans = new ArrayList<Integer>();
                ans.add(target);
                ans.add(num[l]);
                ans.add(num[r]);
                list.add(ans);
                while (l < r && num[l] == num[l+1]) l++;
                while (l < r && num[r] == num[r-1]) r--;
                l++;
                r--;
            } else if (num[l] + num[r] + target < 0) {
                l++;
            } else {
                r--;
            }
        }
    }

}
