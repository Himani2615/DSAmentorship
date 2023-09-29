import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int numDigits = (int) Math.log10(n) + 1;
        
        k = (k % numDigits + numDigits) % numDigits;
        
        int divisor = (int) Math.pow(10, k);
        int remainder = n % divisor;
        int quotient = n / divisor;
        int rotatedNumber = remainder * (int) Math.pow(10, numDigits - k) + quotient;
        
        System.out.println(rotatedNumber);
    
    }
}
