import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("0 0 0")) {
                break;
            }
            
            if (checkRightTriangle(line)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
        
        scanner.close();
    }
    
    static boolean checkRightTriangle(String line) {
        int[] sides = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        return (long) sides[0] * sides[0] + (long) sides[1] * sides[1] == (long) sides[2] * sides[2];
    }
}
