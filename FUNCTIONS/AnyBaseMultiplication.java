package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AnyBaseMultiplication {
    public static int abm(int b, int n1, int n2) {
        // 51
        //x11
        //51*11%10 + 51*11/10*base
        int ans = 0, power = 1;
        while(n2 > 0) {
            int d2 = n2%10;
            n2/=10;
            int halfProduct = getProductWithDigit(b, n1, d2);
            ans = getSum(b, ans, halfProduct * power);
            power*=10;
        }
        return ans;
    }
    public static int getProductWithDigit(int b, int n1, int d2) {
        int power = 1, carry = 0, ans = 0;
        while(n1 > 0 || carry > 0) {
            int d1 = n1%10;
            int value = d1 * d2 + carry;
            carry=value/b;
            value=value%b;
            ans+=value*power;
            n1/=10;
            power*=10;
        }
        return ans;
    }
    public static int getSum(int b, int n1, int n2) {
        int power = 1, carry = 0, sum=0;
        int ans = 0;
        while(n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1%10;
            int d2 = n2%10;
            sum = d1 + d2 + carry;
            carry=sum/b;
            int value=sum%b;
            ans+=value*power;
            n1/=10;
            n2/=10;
            power*=10;
        }
        return ans;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        System.out.print(abm(b, n1, n2)); 
    }
}