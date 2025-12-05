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


// OPÇÃO SIMPLES:

// import java.util.Scanner;
// import java.util.Locale;

// public class SolucaoDidatica1118 {

//     // Configuração do Scanner
//     private static final Scanner ENTRADA = new Scanner(System.in).useLocale(Locale.US);

//     // --- FUNÇÕES DE VALIDAÇÃO DIDÁTICAS ---
    
//     /**
//      * Objetivo: Forçar o usuário a digitar uma nota entre 0.0 e 10.0.
//      * Repete até que a condição seja atendida.
//      * @return A nota válida.
//      */
//     public static double lerNotaValida() {
//         double notaLida;
        
//         // Laço DO-WHILE: Faça a leitura e verificação...
//         do {
//             notaLida = ENTRADA.nextDouble(); 

//             // Se a nota for inválida (fora do intervalo [0, 10]), avise e repita
//             if (notaLida < 0.0 || notaLida > 10.0) {
//                 System.out.println("nota invalida");
//             }
//         // ... ENQUANTO a nota for inválida.
//         } while (notaLida < 0.0 || notaLida > 10.0);
        
//         return notaLida;
//     }

//     /**
//      * Objetivo: Forçar o usuário a escolher 1 (sim) ou 2 (não) para novo cálculo.
//      * Repete até que a condição seja atendida.
//      * @return A opção válida (1 ou 2).
//      */
//     public static int lerOpcaoNovoCalculo() {
//         int opcao;
//         // Laço DO-WHILE: Faça a leitura e a pergunta...
//         do {
//             System.out.println("novo calculo (1-sim 2-nao)");
//             opcao = ENTRADA.nextInt();
//         // ... ENQUANTO a opção NÃO for 1 E NÃO for 2.
//         } while (opcao != 1 && opcao != 2);
//         return opcao;
//     }
//     // --- LÓGICA PRINCIPAL ---
//     public static void main(String[] args) {
//         int desejaContinuar = 0;
//         // Laço principal que controla a REPETIÇÃO de todo o programa.
//         do {
//             // 1. Leitura das duas notas válidas (usa a função de validação 2x)
//             double notaA = lerNotaValida();
//             double notaB = lerNotaValida();
//             // 2. Cálculo e impressão da Média
//             double media = (notaA + notaB) / 2.0;
//             System.out.printf("media = %.2f\n", media);
//             // 3. Pergunta de Repetição (usa a função de validação da opção)
//             desejaContinuar = lerOpcaoNovoCalculo();
//         } while (desejaContinuar == 1); // Repete APENAS se o usuário escolher '1'
//         ENTRADA.close();
//     }
// }


// OUTRA OPÇÃO:

// import java.util.Scanner;
// import java.util.Locale;

// public class Main {
//     // Configuração obrigatória para usar o ponto (.) como decimal
//     private static final Scanner ENTRADA = new Scanner(System.in).useLocale(Locale.US);

//     /**
//      * Função enxuta para ler uma nota e forçar a validação (0.0 a 10.0).
//      */
//     public static double lerNotaValida() {
//         double nota;
//         // Loop DO-WHILE: Repete ENQUANTO a nota for inválida
//         do {
//             nota = ENTRADA.nextDouble();
//             if (nota < 0.0 || nota > 10.0) {
//                 System.out.println("nota invalida");
//             }
//         } while (nota < 0.0 || nota > 10.0);
//         return nota;
//     }

//     public static void main(String[] args) {
//         int opcao = 0;
        
//         // Loop principal para repetir o cálculo ENQUANTO o usuário escolher '1'
//         do {
//             // 1. Leitura e validação das duas notas usando a função enxuta
//             double notaA = lerNotaValida();
//             double notaB = lerNotaValida();
            
//             // 2. Cálculo e impressão da Média
//             double media = (notaA + notaB) / 2.0;
//             System.out.printf("media = %.2f\n", media);
            
//             // 3. Validação da Opção (novo cálculo)
//             // Este é o único trecho com DO-WHILE repetido, mas é necessário 
//             // para manter a lógica de repetição do "novo calculo (1-sim 2-nao)".
//             do {
//                 System.out.println("novo calculo (1-sim 2-nao)");
//                 opcao = ENTRADA.nextInt();
//             } while (opcao != 1 && opcao != 2);
            
//         } while (opcao == 1); 
        
//         // Em um código real, o ENTRADA.close() seria aqui, mas no Beecrowd não é estritamente obrigatório.
//     }
// }