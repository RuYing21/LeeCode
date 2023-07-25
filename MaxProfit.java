package leeCode;

/**
 * 买卖股票的最佳时机
 */
public class MaxProfit {
    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        int[] s = {7, 1, 5, 3, 6, 4};
        mp.maxProfit02(s);
    }

    // 暴力解法
    public int maxProfit01(int[] s) {
        int max = 0;
        int temp = 0;
        int len = s.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                temp = s[j] - s[i];
                max = Math.max(temp, max);

            }
        }
        System.out.println(max);
        return max;
    }


    // 动态规划
    public int maxProfit02(int[] prices) {
        int len = prices.length;
        int res = 0;
        // 前一天卖出可以获得的最大利润
        int pre = 0;
        for (int i = 1; i < len; i++) {
            // 利润差
            int diff = prices[i] - prices[i - 1];
            // 状态转移方程：第i天卖出可以获得的最大利润 = 第i-1天卖出的最大利润 + 利润差
            pre = Math.max(pre + diff, 0);
            res = Math.max(res, pre);
        }
        return res;
    }

}
