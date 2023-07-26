package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairsInArray {
    public static void printPairs(int[] arr) {
        System.out.println("Pairs of the array are as follows:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i]+"," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        printPairs(arr);
    }
}
