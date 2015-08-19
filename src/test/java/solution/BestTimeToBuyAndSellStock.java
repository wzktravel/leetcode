package solution;

/**
 * Created by wzk on 15/8/16.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int in1 = prices[0], in2 = 0;
        int out1 = 0, out2 = 0;
        int profit = 0;

        for (int p : prices) {
            //开始递减序列的话，找到最小的buy
            if (p <= in1 && profit == 0) {
                in1 = p;
                continue;
            }

            if (p > out1) {
                out1 = p;
                profit = out1 - in1;
            } else if (p < in1) {
                in2 = p;
            }

        }


        return profit;
    }

}
