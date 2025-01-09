import java.util.Scanner;

public class Main {
    static int count = 0;
    static int[] mountain;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        
        mountain = new int[count];
        for (int i = 0; i < count; i++) {
            mountain[i] = scanner.nextInt();
        }
        
        int max = 0;
        for (int dragon = 0; dragon < count; dragon++) {
            if (count - dragon - 1 < max) {
                break;
            }
            int win = 0;
            for (int enemy = dragon + 1; enemy < count; enemy++) {
                if (mountain[enemy] > mountain[dragon]) {
                    break;
                }
                win++;
                if (win > max) {
                    max = win;
                }
            }
        }
        
        System.out.println(max);
        
        scanner.close();
    }
}
