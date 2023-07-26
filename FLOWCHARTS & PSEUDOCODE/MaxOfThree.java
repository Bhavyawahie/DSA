import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaxOfThree {
    public static void main(String[] args) throws IOException {
        int max, a, b, c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(bufferedReader.readLine());
        b = Integer.parseInt(bufferedReader.readLine());
        c = Integer.parseInt(bufferedReader.readLine());
        max = c > (a > b ? a : b) ? c : (a > b ? a : b); 
        System.out.println(max);
    }
}
