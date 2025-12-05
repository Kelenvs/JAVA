import java.util.Locale;
import java.util.Scanner;

public class CoordenadasdeumPonto_1041 {
    public static void main(String[] args) {
        // 1. Configura o Locale para garantir que o Scanner use o ponto (.) como separador decimal.
        Locale.setDefault(Locale.US);
        
        // 2. Cria o objeto Scanner para ler a entrada do usuário.
        Scanner sc = new Scanner(System.in);
        
        // 3. Lê os dois valores (coordenadas x e y) como double.
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        // 4. Estrutura de decisão (if-else if-else) para determinar a localização do ponto.
        
        // A. Verifica se está na Origem (x = 0 e y = 0)
        // Usamos (x == 0.0) e (y == 0.0) para checagem exata.
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } 
        
        // B. Verifica se está sobre um dos Eixos
        // Se x = 0 e y != 0, está no Eixo Y.
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        } 
        // Se y = 0 e x != 0, está no Eixo X.
        else if (y == 0.0) {
            System.out.println("Eixo X");
        } 
        
        // C. Verifica os Quadrantes (analisando os sinais de x e y)
        // Q1: x > 0 e y > 0
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } 
        // Q2: x < 0 e y > 0
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } 
        // Q3: x < 0 e y < 0
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } 
        // Q4: x > 0 e y < 0 (Este é o único caso restante se x e y não são zero)
        else { 
            System.out.println("Q4");
        }
        
        // 5. Fecha o Scanner.
        sc.close();
    }
}