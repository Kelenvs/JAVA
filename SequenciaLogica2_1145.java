import java.util.Scanner;

public class SequenciaLogica2_1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Lê os valores X (números por linha) e Y (limite superior).
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        // 2. Loop de 1 até Y (inclusive).
        for (int i = 1; i <= Y; i++) {
            
            // 3. Verifica se o número atual (i) é o último da linha.
            // Para ser o último, o resto da divisão do seu índice em relação ao X deve ser zero.
            // (i % X) == 0 -> indica que i é um múltiplo de X, ou seja, X, 2X, 3X, etc.
            if (i % X == 0) {
                // Se for o último número da linha, imprime o número e quebra a linha (println).
                System.out.println(i);
            } else {
                // Se NÃO for o último número da linha, imprime o número seguido de um espaço (print).
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}