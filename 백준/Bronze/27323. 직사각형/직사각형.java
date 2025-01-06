import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long A = Long.valueOf(scanner.nextLine());
        Long B = Long.valueOf(scanner.nextLine());
        System.out.println(A * B);
        scanner.close();
    }
}
