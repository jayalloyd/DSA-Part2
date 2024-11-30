public class BuyAndSellStockPracticeCode {
    public static int buyAndSellStock(int [] prices){
       int buyPrice=Integer.MAX_VALUE;
       int maxPrice=0;
       for(int i=0;i<prices.length;i++){
       if(buyPrice<prices[i]){
        int profit=prices[i]-buyPrice;
        maxPrice=Math.max(maxPrice, profit);
       }else{
        buyPrice=prices[i];
       }
    }
    return maxPrice;
    }
    public static void main(String[] args) {
        int [] prices={7,6,4,3,1};
        System.out.println(buyAndSellStock(prices));
    }
}
