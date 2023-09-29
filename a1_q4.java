import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int low = input.nextInt();
        int high = input.nextInt();

        for (int num = low; num <= high; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        input.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
