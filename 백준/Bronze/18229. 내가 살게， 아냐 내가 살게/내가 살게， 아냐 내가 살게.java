import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int customerCount = 0;
    static int turnCount = 0;
    static int goalDistance = 0;
    static int[][] changeDistance;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        customerCount = scanner.nextInt();
        turnCount = scanner.nextInt();
        goalDistance = scanner.nextInt();
        scanner.nextLine();
        
        changeDistance = new int[customerCount][turnCount];
        for (int i = 0; i < customerCount; i++) {
            changeDistance[i] = Arrays.stream(scanner.nextLine()
                                                     .split(" "))
                                      .mapToInt(Integer::parseInt)
                                      .toArray();
        }
        int[] result = findBuyer();
        System.out.println(result[0] + " " + result[1]);
        
        scanner.close();
    }
    
    static int[] findBuyer() {
        int[] nowDistance = new int[customerCount];
        for (int turn = 0; turn < turnCount; turn++) {
            for (int customerNum = 0; customerNum < customerCount; customerNum++) {
                nowDistance[customerNum] += changeDistance[customerNum][turn];
                if (nowDistance[customerNum] >= goalDistance) {
                    return new int[]{customerNum + 1, turn + 1};
                }
            }
        }
        return new int[]{0, 0};
    }
}

