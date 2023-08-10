package ARRAYS;

public class SearchSorted2DArray {
    public static boolean searchArray(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int i = 0;
        int j = n - 1;
        while(i < m && j >=0) {
            if(arr[i][j] == target) {
                return true;
            } else if(arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public static boolean searchArrayFromBottom(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int i = m-1;
        int j = 0;
        while(j < n && i >=0) {
            if(arr[i][j] == target) {
                return true;
            } else if(arr[i][j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40}, {15,25,35,45}, {37,29,37,48}, {32,33,39,50}};
        var flag = searchArrayFromBottom(arr, 45);
        if(flag) {
            System.out.println("present in the array");
        } else {
            System.out.println("not present");
        }
    }
}
