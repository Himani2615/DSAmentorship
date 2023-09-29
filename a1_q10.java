import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        PF(num);

    }

    public static void PF(int num) {
        int div = 2;

        while (num > 1) {
            if (num % div == 0) {
                System.out.print(div + " ");
                num = num / div; 
            } else {
                div++;
            }
        }
    }
}
