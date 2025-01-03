import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(reader.readLine());
        int[] numbers = new int[10001];
        
        for (int i = 0; i < count; i++) {
            numbers[Integer.parseInt(reader.readLine())]++;
        }
        
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < numbers.length; i++) {
            while (numbers[i] > 0) {
                output.append(i)
                      .append('\n');
                numbers[i]--;
            }
        }
        
        System.out.println(output);
    }
}
