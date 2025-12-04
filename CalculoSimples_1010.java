import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples_1010 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int cod1 = input.nextInt();
        int num1 = input.nextInt();
        double valor1 = input.nextDouble();

        int cod2 = input.nextInt();
        int num2 = input.nextInt();
        double valor2 = input.nextDouble();

        double total = (num1 * valor1) + (num2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        input.close();
    }
}
