import java.io.IOException;
import java.util.Scanner;

public class ValorAPagar2decimais {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int cod = scanner.nextInt();
        int num = scanner.nextInt();
        double valor = scanner.nextDouble();
        int cod2 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();
        double soma = (num * valor) + (num2 * valor2);

        System.out.println("VALOR A PAGAR: R$ %.2f" + soma);

    }
}
