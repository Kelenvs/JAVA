import java.util.Scanner;

public class Multiplos_1044 {
    public static void main(String[] args) {
        // 1. Cria o objeto Scanner.
        Scanner sc = new Scanner(System.in);
        
        // 2. Lê os dois valores inteiros.
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 3. Verificação da Condição de Múltiplos
        /*
         * Condição: Dois números são múltiplos entre si se um for divisível pelo outro.
         * A % B == 0 (A é múltiplo de B)
         * OU
         * B % A == 0 (B é múltiplo de A)
         */
        if (A % B == 0 || B % A == 0) {
            // Se a condição for verdadeira, eles são múltiplos.
            System.out.println("Sao Multiplos");
        } else {
            // Caso contrário, não são múltiplos.
            System.out.println("Nao sao Multiplos");
        }
        
        // 4. Fecha o Scanner.
        sc.close();
    }
}