import java.io.IOException;
import java.util.Scanner;

public class MaisCavalos_2808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String origem = scanner.next();
        String destino = scanner.next();
        
        // Extrair coluna (letra) e linha (número)
        char colunaOrigem = origem.charAt(0);
        int linhaOrigem = origem.charAt(1) - '0';
        
        char colunaDestino = destino.charAt(0);
        int linhaDestino = destino.charAt(1) - '0';
        
        // Converter letras para números (a=1, b=2, ..., h=8)
        int colOrigem = colunaOrigem - 'a' + 1;
        int colDestino = colunaDestino - 'a' + 1;
        
        // Calcular diferenças
        int diffCol = Math.abs(colDestino - colOrigem);
        int diffLinha = Math.abs(linhaDestino - linhaOrigem);
        
        // Verificar se é um movimento válido de cavalo
        boolean valido = (diffCol == 2 && diffLinha == 1) || 
                         (diffCol == 1 && diffLinha == 2);
        
        if (valido) {
            System.out.println("VALIDO");
        } else {
            System.out.println("INVALIDO");
        }
        
        scanner.close();
    };
};


//OUTRAS POSSIBILIDADES:

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String origem = scanner.next();
//         String destino = scanner.next();
//         int diffCol = Math.abs(origem.charAt(0) - destino.charAt(0));
//         int diffLinha = Math.abs(origem.charAt(1) - destino.charAt(1));
//         // Arrays dos movimentos possíveis do cavalo
//         int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
//         int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};
//         boolean valido = false;       
//         for (int i = 0; i < 8; i++) {
//             if (Math.abs(dx[i]) == diffCol && Math.abs(dy[i]) == diffLinha) {
//                 valido = true;
//                 break;
//             }
//         }    
//         System.out.println(valido ? "VALIDO" : "INVALIDO");  
//         scanner.close();
//     }
// }



// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);       
//         String origem = scanner.next();
//         String destino = scanner.next();
//         // Calcular diferenças direto dos caracteres
//         int diffCol = Math.abs(origem.charAt(0) - destino.charAt(0));
//         int diffLinha = Math.abs(origem.charAt(1) - destino.charAt(1));
//         // Verificar movimento em L
//         if ((diffCol == 2 && diffLinha == 1) || (diffCol == 1 && diffLinha == 2)) {
//             System.out.println("VALIDO");
//         } else {
//             System.out.println("INVALIDO");
//         }
//         scanner.close();
//     }
// }