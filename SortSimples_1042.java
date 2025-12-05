import java.util.Arrays;
import java.util.Scanner;

public class SortSimples_1042 {
    public static void main(String[] args) {
        // 1. Cria o objeto Scanner para ler a entrada.
        Scanner sc = new Scanner(System.in);
        
        // 2. Lê os três valores inteiros da entrada.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 3. Cria um array para armazenar os valores originais.
        // Estes valores serão usados para a impressão final.
        int[] original = {a, b, c};
        
        // 4. Cria uma CÓPIA do array original para ser ordenada.
        // É essencial usar uma cópia para preservar a ordem de leitura.
        int[] sorted = Arrays.copyOf(original, original.length);
        
        // 5. Ordena o array 'sorted' em ordem crescente.
        // O método sort modifica o array diretamente (in-place).
        Arrays.sort(sorted);
        
        // 6. IMPRESSÃO DA SAÍDA
        
        // A. Imprime os valores em ordem crescente (do array 'sorted').
        // Note que o problema pede cada número em uma nova linha.
        for (int valor : sorted) {
            System.out.println(valor);
        }
        
        // Imprime a linha em branco solicitada.
        System.out.println();
        
        // B. Imprime os valores na sequência original (do array 'original').
        for (int valor : original) {
            System.out.println(valor);
        }
        
        // 7. Fecha o Scanner.
        sc.close();
    }
}