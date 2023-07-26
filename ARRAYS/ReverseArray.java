package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseArray {
    public static void reverseArrayTP(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
        System.out.println("reversed array using two pointer:");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int i = arr.length - 1 ; i >=0; i--) {
            // System.out.print(arr[i] + " ");
            reverse.add(arr[i]);
        }
        System.out.print("Reversed array: ");
        for(int i = 0; i < reverse.size(); i++) {
            System.out.print(reverse.get(i) + " ");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        reverseArrayTP(arr);
    }
}
