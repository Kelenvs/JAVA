import java.io.IOException;
import java.util.Scanner;

public class VáriasNotas_1118 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double nota1 = lerNotaValida(scanner);
            double nota2 = lerNotaValida(scanner);
            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f\n", media);

            int resultado;
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                resultado = scanner.nextInt();
            } while (resultado != 1 && resultado != 2);

            if (resultado == 2) {
                break;
            }
        }

        scanner.close();
    }

    public static double lerNotaValida(Scanner scanner) {
        double nota;
        while (true) {
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                return nota;
            } else {
                System.out.println("nota invalida");
            }
        }
    }
}
