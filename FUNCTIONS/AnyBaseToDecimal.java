package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnyBaseToDecimal {
    public static int ab2d(int n, int base) {
        int ans = 0, power = 1;
        while(n > 0) {
            int rem = n%10;
            ans = ans + rem*power;
            n/=10;
            power*=base;
        }
        return ans;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        System.out.println(ab2d(n,b));
    }
}
