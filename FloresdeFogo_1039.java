import java.io.IOException;
import java.util.Scanner;

public class FloresdeFogo_1039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int R1 = scanner.nextInt(); // Raio do círculo do caçador
            int X1 = scanner.nextInt(); // Centro X do caçador
            int Y1 = scanner.nextInt(); // Centro Y do caçador
            
            int R2 = scanner.nextInt(); // Raio do círculo da flor
            int X2 = scanner.nextInt(); // Centro X da flor
            int Y2 = scanner.nextInt(); // Centro Y da flor
            
            // Calcular distância entre os centros
            double distancia = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
            
            // Verificar se a flor está completamente dentro do círculo do caçador
            if (distancia + R2 <= R1) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
        
        scanner.close();
    }
}



// ## Explicação Visual:
// ```
// Círculo do caçador (R1) precisa englobar o círculo da flor (R2)

//     RICO:                    MORTO:
//     ┌─────────┐              ┌─────┐
//     │    ┌─┐  │              │  ┌──┼──┐
//     │  (flor) │              │  │flor │
//     │    └─┘  │              └──┼──┘  │
//     └─────────┘                 └─────┘
//    (caçador)                  flor sai fora!

