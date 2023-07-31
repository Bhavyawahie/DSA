import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Practice {
    public static void printArray(int[] arr) {
        System.out.print("Updated Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[i] > arr[i+1]) {
                    arr[i] = arr[i] + arr[i+1];
                    arr[i+1] = arr[i] - arr[i+1];
                    arr[i] = arr[i] - arr[i+1];
                }
            }
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i; 
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >=0; j--) {
                if(arr[j] > temp) {
                    arr[j+1] = arr[j];
                }
            }
            arr[j+1] = temp;
        }
    }
    public static void coutingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] counting = new int[largest+1];
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
        //function call
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        coutingSort(arr);
        printArray(arr);
    }
    
}