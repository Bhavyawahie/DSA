package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrappingRainwaterOptimized {
    public static void trappedRainwater(int[] arr) {
        int totalWaterStoredSum = 0;
        int width = 1;
        int n = arr.length;

        if(n==0) {
            System.out.println(totalWaterStoredSum);
            return;
        }

        int[] maxleft = new int[n]; 
        maxleft[0] = arr[0];
        for (int j = 1; j < n; j++) {
            maxleft[j] = Math.max(maxleft[j -1], arr[j]);
        }

        int[] maxright = new int[n];
        maxright[n-1] = arr[n-1];
        for (int j = n - 2; j >= 0 ; j--) {
            maxright[j] = Math.max(maxright[j+1], arr[j]);
        }

        for (int i = 0; i < n; i++) {
            int heightOfArrayElement = arr[i];
            int waterLevel = Math.min(maxleft[i], maxright[i]);
            int totalWaterStored = (waterLevel - heightOfArrayElement) * width;
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
