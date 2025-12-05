import java.util.Locale;
import java.util.Scanner;

public class Triângulo_1043 {
    public static void main(String[] args) {
        // 1. Configura o Locale para garantir que o Scanner use o ponto (.) como separador decimal.
        Locale.setDefault(Locale.US);
        
        // 2. Cria o objeto Scanner.
        Scanner sc = new Scanner(System.in);
        
        // 3. Lê os três valores reais (double).
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        // Variáveis para armazenar os resultados.
        double resultado;
        String mensagem;
        
        // 4. VERIFICAÇÃO DA CONDIÇÃO DE EXISTÊNCIA DE TRIÂNGULOS
        // Um triângulo existe se, e somente se, a soma de dois lados for maior que o terceiro lado.
        if (A + B > C && A + C > B && B + C > A) {
            // Caso Positivo: É um triângulo.
            
            // a) Calcula o Perímetro (soma dos três lados).
            resultado = A + B + C;
            mensagem = "Perimetro";
            
        } else {
            // Caso Negativo: Não é um triângulo, então é um trapézio.
            
            // b) Calcula a Área do Trapézio.
            // Fórmula: Area = ((Base Maior + Base Menor) * Altura) / 2
            // O problema define A e B como bases e C como altura.
            resultado = ((A + B) * C) / 2.0;
            mensagem = "Area";
        }
        
        // 5. IMPRESSÃO DA SAÍDA FORMATADA
        // Usa printf para formatar o resultado com uma casa decimal (%.1f).
        System.out.printf("%s = %.1f%n", mensagem, resultado);
        
        // 6. Fecha o Scanner.
        sc.close();
    }
}