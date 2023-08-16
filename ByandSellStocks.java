public class ByandSellStocks {

    public static int Find_By_Sell_Profit(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {

                int profit = price[i] - buyprice;
                max_profit = Math.max(profit, max_profit);

            } else {

                buyprice = price[i];
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("your maximum profit is :" + Find_By_Sell_Profit(price));
    }
}
