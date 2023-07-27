package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadaneMaxSubArraySum {
    public static void maxSubArraySum(int[] arr) {
        int n = arr.length;
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum Subarray sum is: " + maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        maxSubArraySum(arr);
    }
}
