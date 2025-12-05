import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Tipos de Triângulos104 {
    public static void main(String[] args) {
        // 1. Configura o Locale e o Scanner.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 2. Lê os três valores de ponto flutuante.
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double Z = sc.nextDouble();

        // 3. Coloca os valores em um array para facilitar a ordenação.
        double[] lados = {X, Y, Z};
        
        // Ordena o array em ordem crescente.
        Arrays.sort(lados);
        
        // Atribui as variáveis A, B e C para que A seja o maior lado (ordem decrescente).
        // O maior lado (A) é o último elemento do array ordenado.
        double A = lados[2]; 
        double B = lados[1]; 
        double C = lados[0];

        // 4. VERIFICAÇÃO PRINCIPAL: EXISTÊNCIA DO TRIÂNGULO (Condição A ≥ B + C)
        // Se A for maior ou igual à soma dos outros dois, NÃO FORMA TRIÂNGULO.
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
            
        } else {
            // Se forma triângulo, iniciamos a classificação baseada nos ângulos.

            // 5. CLASSIFICAÇÃO PELOS ÂNGULOS (Baseado no Teorema de Pitágoras e Extensões)
            
            // É importante trabalhar com o quadrado dos valores para evitar problemas de precisão.
            double A2 = A * A;
            double B2 = B * B;
            double C2 = C * C;

            // TRIANGULO RETANGULO: A² = B² + C²
            if (A2 == B2 + C2) {
                System.out.println("TRIANGULO RETANGULO");
            } 
            // TRIANGULO OBTUSANGULO: A² > B² + C²
            else if (A2 > B2 + C2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } 
            // TRIANGULO ACUTANGULO: A² < B² + C² (Este é o único caso restante de ângulos)
            else { // A2 < B2 + C2
                System.out.println("TRIANGULO ACUTANGULO");
            }
            
            // 6. CLASSIFICAÇÃO PELOS LADOS (Feita separadamente, pois pode acumular com a anterior)
            
            // TRIANGULO EQUILATERO: 3 lados iguais
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } 
            // TRIANGULO ISOSCELES: 2 lados iguais (e não os 3, pois já foi coberto acima)
            // A, B ou C já são os lados do triângulo. 
            // A condição "apenas dois lados iguais" é verificada garantindo que os três não sejam iguais.
            else if (A == B || B == C || A == C) {
                 System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        sc.close();
    }
}