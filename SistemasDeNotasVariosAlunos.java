import java.util.Scanner;

public class SistemasDeNotasVariosAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlunos = 0;
        String nome;

        System.out.println("=== SISTEMA DE NOTAS - VERSÃO 2.0 ===");

        do {
            System.out.print("\nDigite o nome do aluno (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine(); 

            double media = (nota1 + nota2) / 2;
            String resultado;
            double maior = (nota1 > nota2) ? nota1 : nota2;

            if (media >= 7) {
                resultado = "APROVADO POR MÉDIA";
            } else if (media >= 5) {
                resultado = "APROVADO";
            } else {
                resultado = "REPROVADO";
            }

            System.out.println("\n--- RELATÓRIO DO ALUNO ---");
            System.out.println("Nome: " + nome);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.printf("Média: %.2f%n", media);
            System.out.println("Situação: " + resultado);
            System.out.println("Maior nota: " + maior);

            totalAlunos++;

        } while (true); 

        System.out.println("\n=== RESUMO FINAL ===");
        System.out.println("Total de alunos processados: " + totalAlunos);
        System.out.println("\nPrograma encerrado. Obrigado por usar o Sistema de Notas!");

        scanner.close();
    }
}

// import java.util.Scanner;

// public class SistemasDeNotasVariosAlunos {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         do {
//         System.out.println("Digite o nome do aluno: ");
//         String nome = scanner.nextLine();
//         System.out.println("Digite a primeira nota do aluno: ");
//         double nota1 = scanner.nextDouble();
//         System.out.println("Digite a segunda nota do aluno: ");
//         double nota2 = scanner.nextDouble();
//         double media = (nota1 + nota2) / 2;
//         String resultado;
//         double maior;
//         int totalAlunos = 0;

//         while (true) {
//             System.out.print("\nDigite o nome do aluno (ou 'fim' para encerrar): ");
//             String nome = scanner.nextLine();

//             // condição de saída
//             if (nome.equalsIgnoreCase("fim")) {
//                 break;
//             }


//         if (media >= 5 && media < 7) {
//             resultado = "APROVADO";
//         } else if (media < 5) {
//             resultado = "REPROVADO";
//         } else {
//             resultado = "APROVADO POR MÉDIA";
//         }

//         if (nota1 > nota2) {
//             maior = nota1;
//         } else {
//             maior = nota2;
//         }
 
//         System.out.println("--- RELATÓRIO DO ALUNO --- ");
//         System.out.println("Nome: " + nome);
//         System.out.println("Nota 1: " + nota1);
//         System.out.println("Nota 2: " + nota2);
//         System.out.println("Média: " + media);
//         System.out.println("Situação: " + resultado);
//         System.out.println("Maior nota: " + maior);

//         totalAlunos++;

//         System.out.println("Total de alunos processados: " + totalAlunos);
//         System.out.println("\nPrograma encerrado. Obrigado por usar o Sistema de Notas!");

//         scanner.close();
//     }
// }}}