import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int cod1 = scanner.nextInt();
        int num1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int cod2 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double total = (num1 * valor1) + (num2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        scanner.close();
    }
}