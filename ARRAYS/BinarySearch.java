package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
    public static boolean binarySearch(int[] arr, int n) {
        int lo = 0, hi = arr.length;
        boolean flag = false;
        while(lo < hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == n) {
                flag = true;
                break;
            } else if(n > arr[mid]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return flag;
    }
    public static void main(String[] args) throws IOException {
        int[] numbers = {2,4,6,8,10,12,14,16};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        boolean flag = binarySearch(numbers, n);
        if(!flag) {
            System.out.println(n + " not found");
        } 
        else {
            System.out.println(n + " found");
        }
    }
}
