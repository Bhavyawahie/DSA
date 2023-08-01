package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnyBaseToAnyBase {
    public static int ab2ab(int n, int b1, int b2) {
        int ans = 0, power = 1;
        while(n>0) {
            int rem = n%10;
            n/=10;
            ans = ans + rem * power;
            power*=b1;
        }
        int fAns = 0;
        power = 1;
        while(ans > 0) {
            int rem = ans%b2;
            ans/=b2;
            fAns = fAns + rem * power;
            power*=10;
        }
        return fAns;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int b1 = Integer.parseInt(br.readLine());
        int b2 = Integer.parseInt(br.readLine());
        System.out.print(ab2ab(n, b1, b2)); 
    }
}
