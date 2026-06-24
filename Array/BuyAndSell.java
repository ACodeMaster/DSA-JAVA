import java.util.*;
class BuyAndSell{
    public static void main(String[] args){
        int prices[] = {7,1,3,5,6,4};

        //Display the Array

        System.out.print("The Array is: ");
        for (int i=0; i<prices.length; i++){
            System.out.print(prices[i]+" ");

        }
        BAS(prices);
    }

    public static void BAS(int prices[]){
        int MaxProfit = 0;
        int MinPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<MinPrice){
                MinPrice = prices[i];
            }

            int profit = prices[i] - MinPrice;

            if(profit>MaxProfit){
                MaxProfit = profit;
            }
        }
        System.out.print("The Maximum profit will be: "+MaxProfit);
    }
}