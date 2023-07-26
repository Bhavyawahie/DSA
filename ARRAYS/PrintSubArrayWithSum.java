package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintSubArrayWithSum {
    public static void maxAndMinOfSums(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer sum : arr) {
            if(sum < min) {
                min = sum;
            } else if(sum > max) {
                max = sum;
            }
        }
        System.out.println("Maximum sum of subarrays is " + max);
        System.out.println("Minimum sum of subarrays is " + min);
    }

    public static void printSubArrayWithSum(int[] arr) {
        ArrayList<Integer> sumArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum +=arr[k];
                    System.out.print(arr[k] + " ");
                }
                sumArray.add(sum);
                System.out.print(" ---> sum = " + sum);
                System.out.println();
            }
            System.out.println();
        }
        maxAndMinOfSums(sumArray);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        printSubArrayWithSum(arr);
    }
}
