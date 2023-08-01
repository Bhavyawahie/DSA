package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AnyBaseAddition {
    public static int abAddition(int b, int n1, int n2) {
        int ans = 0;
        int carry = 0, sum = 0, power = 1;
        while(n1  > 0 || n2 > 0 || carry > 0) {
            int d1 = n1%10;
            int d2 = n2%10;
            sum = d1 + d2 + carry;
            carry = sum/b;
            int value = sum%b;
            ans += value*power;
            power*=10;
            n1/=10;
            n2/=10;
        }
        return ans;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        System.out.print(abAddition(b, n1, n2)); 
    }
}