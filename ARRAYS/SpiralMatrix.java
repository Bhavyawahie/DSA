package ARRAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralMatrix {
    public static void printSpiralMatrix(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int startRow = 0, startCol = 0, endRow = m - 1, endCol = n - 1;
        while(startRow <= endCol && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;
            for (int j = endCol; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }
            endRow--;
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(arr[i][startCol] +" ");
            }
            startCol++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        // int m = Integer.parseInt(br.readLine());
        // int n = Integer.parseInt(br.readLine());
        // int[][] arr = new int[m][n];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         arr[i][j] = Integer.parseInt(br.readLine());
        //     }
        // }
        printSpiralMatrix(arr);
    }
}
