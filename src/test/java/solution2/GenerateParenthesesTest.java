package solution2;

import org.junit.Test;

import java.util.List;

/**
 * Created by wzk on 15/8/22.
 */
public class GenerateParenthesesTest {



    @Test
    public void test() {
        GenerateParentheses gp = new GenerateParentheses();
        List<String> list = gp.generateParenthesis(3);


        for (String s : list) {
            System.out.println(s);
        }
    }

}
