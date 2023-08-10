package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiagnolSum {
    public static int sumofDiagnolsOfMatrix(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +  arr[i][i] + (i != arr.length - 1 - i ? arr[i][arr.length-1-i] : 0);
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println(sumofDiagnolsOfMatrix(arr));
    }
}
