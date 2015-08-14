package solution;

/**
 * Created by wangzhengkun on 2015/7/4.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        if (height == null || height.length <= 1) {
            return 0;
        }
        int len = height.length;
        int max = 0, area = 0;

        for (int i = 0, j = len - 1; i < j; ) {
            area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(max, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        if (height == null || height.length <= 1) {
            return 0;
        }
        int len = height.length;
        int max = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(area, max);
            }
        }
        System.out.println(max);
        return max;
    }



}
