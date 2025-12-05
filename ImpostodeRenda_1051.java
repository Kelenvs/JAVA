import java.util.Locale;
import java.util.Scanner;

public class ImpostodeRenda_1051 {
    public static void main(String[] args) {
        // 1. Configura o Locale e o Scanner.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // 2. Lê o salário.
        double salario = sc.nextDouble();
        
        double imposto = 0.0;
        
        // 3. ESTRUTURA DE CÁLCULO POR FAIXAS (Começando da faixa de maior imposto para simplificar a lógica)
        
        // --- 5ª FAIXA: Acima de R$ 4500.00 (Taxa de 28%) ---
        // Se o salário ultrapassa 4500.00, a parcela que excede 4500.00 paga 28%.
        if (salario > 4500.00) {
            imposto += (salario - 4500.00) * 0.28;
            salario = 4500.00; // Reduz o salário para o limite da faixa, permitindo a próxima verificação.
        }
        
        // --- 4ª FAIXA: R$ 3000.01 a R$ 4500.00 (Taxa de 18%) ---
        // Se o salário restante (ou o original) está nessa faixa.
        if (salario > 3000.00) {
            // A parcela tributável é até 1500.00 (4500.00 - 3000.00).
            imposto += (salario - 3000.00) * 0.18;
            salario = 3000.00; // Reduz o salário para o limite da próxima faixa.
        }
        
        // --- 3ª FAIXA: R$ 2000.01 a R$ 3000.00 (Taxa de 8%) ---
        // Se o salário restante está nessa faixa.
        if (salario > 2000.00) {
            // A parcela tributável é até 1000.00 (3000.00 - 2000.00).
            imposto += (salario - 2000.00) * 0.08;
            salario = 2000.00; // Reduz o salário para o limite da faixa isenta.
        }
        
        // --- 1ª e 2ª FAIXAS: R$ 0.00 a R$ 2000.00 (Isento) ---
        // Se o salário restante é <= 2000.00, não há mais imposto a adicionar.
        
        // 4. IMPRESSÃO DA SAÍDA
        if (imposto == 0.0) {
            // Se o imposto acumulado é zero, o salário é isento (<= 2000.00).
            System.out.println("Isento");
        } else {
            // Imprime o resultado formatado com duas casas decimais.
            System.out.printf("R$ %.2f%n", imposto);
        }
        
        sc.close();
    }
}