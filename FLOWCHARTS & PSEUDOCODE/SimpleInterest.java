import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {
    public static void main(String[] args) throws IOException {
        int interest, principal, rate, time;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        principal = Integer.parseInt(bufferedReader.readLine());
        rate = Integer.parseInt(bufferedReader.readLine());
        time = Integer.parseInt(bufferedReader.readLine());
        interest = (principal * rate * time)/100; 
        System.out.println(interest);
    }
}
