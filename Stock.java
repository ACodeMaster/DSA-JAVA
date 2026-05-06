public class Stock{
    public static int maxProfit(int [] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice= prices[i];
            }
            int profit = prices[i] - minPrice;

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={1,4,2,7,4,6};
        int result = maxProfit(prices);
        System.out.println("Maximum profit earnes is:"+result);
    }
}