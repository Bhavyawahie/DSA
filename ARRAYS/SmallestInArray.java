package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestInArray {
    public static int smallestInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            if(a < min) {
                min = a;
            }
        }
        return min;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int smallest = smallestInArray(arr);
        System.out.println("Smallest element in the array is " + smallest);
    }
}
