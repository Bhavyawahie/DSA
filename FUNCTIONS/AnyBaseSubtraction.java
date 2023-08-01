package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AnyBaseSubtraction {
    public static int abSubtraction(int b, int n1, int n2) {
        int ans = 0;
        int carry = 0, power = 1;
        while(n2 > 0) {
            int d1 = n1%10;
            int d2 = n2%10;
            int d = d2 - d1 - carry;
            if(d < 0) {
                carry = 1;
                d+=b;
            } else {
                carry=0;
            }
            ans += d*power;
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
        System.out.print(abSubtraction(b, n1, n2)); 
    }
}