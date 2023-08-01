package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToAnyBase {
    public static int getValueInBase(int n , int base) {
        int ans = 0, power = 1;
        while(n > 0) {
            int rem = n%base;
            ans = ans + rem*power;
            n/=base;
            power*=10;
        }
        return ans;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(getValueInBase(n, b));
    }
}
