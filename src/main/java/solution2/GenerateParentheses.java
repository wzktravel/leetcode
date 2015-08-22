package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzk on 15/8/22.
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        if (n <= 0) {
            return list;
        }
        generate(n, n, "", list);
        return list;
    }


    public void generate(int leftNum, int rightNum, String s, List<String> list) {
        if (leftNum == 0 && rightNum == 0) {
            list.add(s);
        }
        if (leftNum > 0) {
            generate(leftNum - 1, rightNum, s+'(', list);
        }
        if (rightNum > 0 && leftNum < rightNum) {
            generate(leftNum, rightNum - 1, s+')', list);
        }
    }

}
