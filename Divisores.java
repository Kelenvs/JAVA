import java.util.Scanner;
import java.io.IOException;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // verifica se é divisor
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
