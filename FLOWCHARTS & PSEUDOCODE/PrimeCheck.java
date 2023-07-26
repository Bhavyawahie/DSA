import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int i = 2;
        for(; i*i <= n; i++) {
            if(n%i == 0 ) {
                break;
            }
        }
        if(i*i > n) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
