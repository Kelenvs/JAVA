import java.util.Scanner;
import java.io.IOException;

public class Idades {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int [] idades = {34,56,44,23,-2};

        int soma = 0;
        int contador = 0;

        // Percorre o array até encontrar o número negativo
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 0) { // quando encontrar número negativo, para
                break;
            }
            soma += idades[i];
            contador++;
        }

        // Calcula e exibe a média
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("%.2f%n", media);
        }
    }
}