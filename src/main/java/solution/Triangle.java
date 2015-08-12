package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() < 1) {
            return 0;
        }
        int size = triangle.size();
        if (size == 1) {
            if (triangle.get(0) == null || triangle.get(0).size() < 1) {
                return 0;
            }
            return triangle.get(0).get(0);
        }
        List<Integer> tmp = new ArrayList<Integer>(triangle.get(size - 2).size());
        for (int i = size - 1; i > 1; i--) {
            List<Integer> upList = triangle.get(i - 1);
            for (int j = 0; j < upList.size(); j++) {
                
            }
        }

        return 0;
    }

}
