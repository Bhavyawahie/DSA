package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            arr[i] = arr[i] + arr[pos];
            arr[pos] = arr[i] - arr[pos];
            arr[i] = arr[i] - arr[pos];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        selectionSort(input);
        System.out.print("Sorted Array: ");
        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}
