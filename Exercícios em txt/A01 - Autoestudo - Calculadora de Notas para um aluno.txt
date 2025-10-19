import java.util.Scanner;
 
public class Media2notas {
     public static void main(String[] args) {         
        Scanner scanner = new Scanner(System.in);                 
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();
        scanner.close();
        double maior;
        if (nota1 > nota2) {
            maior = nota1;
        } else {
            maior = nota2;
        }
 
        double media = (nota1 + nota2) / 2;
        String resultado;
        if (media >= 5 && media < 7) {
            resultado = "APROVADO";
        } else if (media < 5) {
            resultado = "REPROVADO";
        } else {
            resultado = "APROVADO POR MÉDIA";
        }
        //maior = Math.max(nota1,nota2);
        System.out.println("--- RELATÓRIO DO ALUNO --- ");
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + resultado);
        System.out.println("Maior nota: " + maior);
 
 
    }
}
 