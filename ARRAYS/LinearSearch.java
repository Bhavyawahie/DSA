package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {
    public static boolean linearSearch(int[] arr, int n) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) throws IOException {
        int[] numbers = {2,4,6,8,10,12,14,16};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberToFind = Integer.parseInt(bufferedReader.readLine());
        var flag = linearSearch(numbers, numberToFind);
        if(flag) {
            System.out.println(numberToFind + " found");
        }  else {
            System.out.println(numberToFind + " not found");
        }
    }
}
