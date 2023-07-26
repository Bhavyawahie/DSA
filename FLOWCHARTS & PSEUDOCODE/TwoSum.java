import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSum {
    public static void main(String[] args) throws IOException{
        int sum, a, b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(bufferedReader.readLine());
        b = Integer.parseInt(bufferedReader.readLine());
        sum = a + b;
        System.out.println(sum);
    }
}