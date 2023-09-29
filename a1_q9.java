import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = GCD(num1, num2);
        int lcm = (num1 * num2) / gcd;


        System.out.println(gcd);
        System.out.println(lcm);
    }


    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
