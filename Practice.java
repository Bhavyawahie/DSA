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
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
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
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            for(; j>=0; j--) {
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
        int[] counting = new int[largest + 1];
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

    public static boolean linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int n) {
        int lo = 0, hi = arr.length;
        while(lo < hi) {
            int mid = lo + (hi -lo)/2;
            if(arr[mid] == n) {
                return true;
            } else if(arr[mid] < n) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return false;
    }

    public static int largestInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallestInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int digitFrequency(int n, int d) {
        int count = 0;
        while(n > 0) {
            int rem = n%10;
            if(rem == d) {
                count++;
            }
            n/=10;
        }
        return count;
    }

    public static int getValueInBase(int n, int b) {
        int ans = 0, power = 1, hostBase = 10;
        while(n > 0) {
            int rem = n%b;
            ans = ans + rem * power;
            power = power * hostBase;
            n = n/b;
        }
        return ans;
    }
    
    public static int getValueInDecimalBase(int n, int b) {
        int ans = 0, power = 1, hostBase = b, db = 10;
        while(n > 0) {
            int rem = n%db;
            ans+= rem*power;
            power*=hostBase;
            n/=db;
        } 
        return ans;
    }
    
    public static int ab2ab(int n, int b1, int b2) {
        int tempAns = 0, power = 1, sb = b1, db = 10;
        while(n > 0) {
            int rem = n%db;
            tempAns = tempAns + rem*power;
            power*=sb;
            n/=db;
        }
        power = 1; sb=10; db = b2; 
        int ans = 0;
        while(n > 0) {
            int rem = n%db;
            ans = ans + rem*power;
            power*=sb;
            n/=db;
        }
        return ans;
    }
    
    public static int anyBaseAddtion(int n1, int n2, int b) {
        int power = 1, c = 0, ans = 0;
        while(n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1%10;
            int d2 = n2%10;
            int d = d1 + d2 + c;
            c = d/b;
            d = d%b;
            ans = ans + d * power;
            power*=10;
            n1/=10;
            n2/=10;
        }
        return ans;
    }

    public static int anyBaseSubstraction(int n1, int n2, int b) {
        int ans = 0, power = 1, carry = 0;
        while(n2 > 0) {
            int d1 = n1%10;
            int d2 = n2%10;
            int d = d2 - d1 - carry;
            if(d < 0) {
                carry = 1;
                d += b; 
            } else {
                carry = 0;
            }
            ans = ans + d*power;
            power*=10;
            n1/=10;
            n2/=10;
        }
        return ans;
    }
    
    public static int anyBaseMultiplication(int n1, int n2, int b) {
        int ans = 0, power = 1;
        while(n2 > 0) {
            int d2 = n2%10;
            n2/=10;
            int halfProduct = getProductWithDigit(n1, d2, b);
            ans = anyBaseAddtion(ans, halfProduct*power, b);
            power*=10;
            //multiply ka function with a single digit
            //sum ka function with a single digit with ans and respective base
        }
        return ans;
    }
    public static int getProductWithDigit(int n1, int d2, int b) {
        int carry = 0, ans = 0, power = 1;
        while(n1 > 0 || carry > 0) {
            int d1 = n1%10;
            int d = d1 * d2 + carry;
            carry = d/b;
            d = d%b;
            ans += d*power;
            n1/=10;
            power*=10;
        }
        return ans;
    }
    
    public static void reverseAnArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }
    }
    
    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    
    public static void printSubarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();
            }
        }
    }
    
    public static void maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    subArraySum+=arr[k];
                    max = Math.max(max, subArraySum);
                }
            }
        }
        System.out.println(max);
    }
    
    public static void maxSubArraySum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySum = prefixSum[j] - (i > 0 ? prefixSum[i-1]: 0);
                max = Math.max(max, subArraySum);
            }
        }
        System.out.println(max);
    }
    
    public static void kadane(int[] arr) {
        int n = arr.length;
        int currSum = arr[0], maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }

    public static void trappedRainwater(int [] arr) {
        int totalWaterStoredSum = 0;
        int width = 1;
        int n = arr.length;
        
        if(n==0) {
            System.out.println(totalWaterStoredSum);
            return;
        }
        int[] maxLeft = new int[n];
        maxLeft[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], arr[i]);
        } 
        int[] maxRight = new int[n];
        maxRight[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i+1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            int heightOfBuilding = arr[i];
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            int totalWaterStored = (waterLevel - heightOfBuilding) * width;
            totalWaterStoredSum += totalWaterStored;
        } 
        System.out.println(totalWaterStoredSum);
    }

    public static int stockBuy(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = { 2,4,6,8,10 };
        // // int n = Integer.parseInt(br.readLine());
        // // int[] arr = new int[n];
        // // for (int i = 0; i < arr.length; i++) {
        // // arr[i] = Integer.parseInt(br.readLine());
        // // }
        // var f = linearSearch(arr, 80);
        // System.out.println(f);
        maxSubArraySum(arr);
        // printArray(arr);
    }

}