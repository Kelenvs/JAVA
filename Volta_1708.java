import java.io.IOException;
import java.util.Scanner;

public class Volta_1708 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt(); // Tempo do piloto rápido
        int Y = scanner.nextInt(); // Tempo do piloto lento
        
        // Diferença de tempo por volta
        int diferenca = Y - X;
        
        // Número de voltas necessárias (arredondando para cima)
        int voltas = (Y + diferenca - 1) / diferenca; // Divisão inteira com arredondamento para cima
        // Ou: int voltas = (int) Math.ceil((double) Y / diferenca);
        
        System.out.println(voltas);
        
        scanner.close();
    };
};