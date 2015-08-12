package solution;

/**
 * Created by wzk on 15/8/12.
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        boolean isFound = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (i != j) {
                    if (numbers[i] + numbers[j] == target) {
                        res[0] = i + 1;
                        res[1] = j + 1;
                        isFound = true;
                        break;
                    }
                }
            }
            if (isFound) {
                break;
            }
        }

        return res;
    }

}
