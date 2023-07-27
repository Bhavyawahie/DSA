package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainwater {
    public static boolean isAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void trappedRainwater(int[] arr) {
        int n = arr.length;
        int totalWaterStoredSum = 0;
        int width = 1;
        for (int i = 0; i < n; i++) {
            if(n <= 2 || isAsc(arr) || isDesc(arr)) {
                break;
            }
            int heightOfArrayElement = arr[i];
            int maxleft = Integer.MIN_VALUE, maxright = Integer.MIN_VALUE;
            int waterLevel = 0, totalWaterStored; 
            for (int j = i; j >=0 ; j--) {
                maxleft = Math.max(maxleft, arr[j]);
            }
            for (int j = i; j < n; j++) {
                maxright= Math.max(maxright, arr[j]);
            }
            waterLevel = Math.min(maxleft, maxright);
            totalWaterStored = (waterLevel - heightOfArrayElement) * width;
            totalWaterStoredSum += totalWaterStored;
        }
        System.out.println(totalWaterStoredSum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        trappedRainwater(arr);
    }
}
