import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2 / 2.0);
        if (media < 5) {
            System.out.println("Reprovado");
        } else if (media < 6.9) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Aprovado por média");
        }

        if (nota1 > nota2) {
            System.out.println("maiorNota: " + nota1);
        } else if (nota2 > nota1) {
            System.out.println("maiorNota: " + nota2);
        } else {
            System.out.println("As notas são iguais");
        }
        scanner.close();
    }
}
