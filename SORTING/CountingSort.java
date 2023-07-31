package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] counting = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < counting.length; i++) {
            while(counting[i] > 0) {
                arr[j] = i;
                j++;
                counting[i]--;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        countingSort(arr);
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
