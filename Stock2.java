public class Stock2{
    public static int MaxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                MaxProfit += prices[i]-prices[i-1];
            }
            
        }
        return MaxProfit;
    }
        
    public static void main(String args[]){
        int prices[] = {4,2,6,1,7};
        int result = MaxProfit(prices);
        System.out.println("THe MaxProfit is : "+ result);
    }
}