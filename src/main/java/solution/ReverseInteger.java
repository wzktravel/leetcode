package solution;

/**
 * Created by wzk on 15/3/7.
 */
public class ReverseInteger {

    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
//        boolean isNegative = x < 0 ? true : false;
        StringBuffer xs = new StringBuffer();
        String abs = String.valueOf(Math.abs(x));
        for (int i = abs.length() - 1; i >= 0; i--) {
            xs.append(abs.charAt(i));
        }
        int xx = 0;
        try {
            xx = Integer.valueOf(xs.toString());
        } catch (Exception e) {
        }
        return x < 0 ? (0 - xx) : xx;
    }

    public int reverse2(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        int num = Math.abs(x);
        int res = 0;
        while(num!=0)
        {
            if(res>(Integer.MAX_VALUE-num%10)/10)
                return 0;
            res = res*10+num%10;
            num /= 10;
        }
        return x>0?res:-res;
    }

}
