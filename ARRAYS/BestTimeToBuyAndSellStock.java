package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;           //make this shit 'MINIMUM'
        int maxProfit = 0;                          //MAXIMIZE this shit 
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("Maximum profit is " + maxProfit(arr));
    }
}
