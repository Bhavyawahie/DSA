package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitFrequency {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int count = 0;
        while(n > 0) {
            int rem = n%10;
            if(rem == d) {
                count++;
            }
            n/=10;
        }
        System.out.println("Count of digit " + d + " is " + count);
    }
}
