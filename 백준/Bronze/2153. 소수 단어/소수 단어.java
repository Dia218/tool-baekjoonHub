import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime;
        isPrime = checkPrime(calculateScore(scanner.nextLine()));
        if (isPrime) {
            System.out.println("It is a prime word.");
        }
        if (!isPrime) {
            System.out.println("It is not a prime word.");
        }
        
        scanner.close();
    }
    
    static int calculateScore(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                score += (word.charAt(i) - 'a' + 1);
            }
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                score += (word.charAt(i) - 'A' + 27);
            }
        }
        return score;
    }
    
    static boolean checkPrime(int number) {
        if (number != 2 && number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
