package solution;

/**
 * Created by wzk on 15/7/4.
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        String[] ss = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int xx[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder s = new StringBuilder();
        for (int i = 0; num > 0; i++) {
            while (num >= xx[i]) {
                num -= xx[i];
                s.append(ss[i]);
            }
        }
        return s.toString();
    }

}
