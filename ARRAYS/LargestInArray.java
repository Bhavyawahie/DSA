package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestInArray {
    public static int largestInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            if(a > max) {
                max = a;
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int largest = largestInArray(arr);
        System.out.println("Largest element in the array is " + largest);
    }
}
