import java.io.IOException;
import java.util.Scanner;

public class TipodeCombustivel_1134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar contadores
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        // Loop principal
        while (true) {
            int codigo = scanner.nextInt();
            
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else if (codigo == 4) {
                break;
            }
            // Se for outro número, não faz nada (ignora e continua o loop)
        }
        
        // Saída
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        scanner.close();
    }
}