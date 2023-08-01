package FUNCTIONS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AnyBaseMultiplication {
    public static int ambHelper() {

    }
    public static int abm(int b, int n1, int n2) {
        int sum = 0 , power = 1;
        while(n2 > 0) {
            int rem = n2%10;
            ambHelper();
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        System.out.print(abm(b, n1, n2)); 
    }
}