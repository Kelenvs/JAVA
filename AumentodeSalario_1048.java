import java.util.Locale;
import java.util.Scanner;

public class AumentodeSalario_1048  {
    public static void main(String[] args) {
        // 1. Configura o Locale para garantir que o Scanner e o printf usem o ponto (.) como separador decimal.
        Locale.setDefault(Locale.US);
        
        // 2. Cria o objeto Scanner.
        Scanner sc = new Scanner(System.in);
        
        // 3. Lê o salário atual do funcionário.
        double salario = sc.nextDouble();
        
        // Variáveis para armazenar o percentual de reajuste (em número inteiro),
        // o valor do reajuste e o novo salário.
        double percentual = 0.0;
        double reajusteGanho;
        double novoSalario;
        
        // 4. ESTRUTURA CONDICIONAL (if-else if) para determinar o percentual de reajuste.
        
        if (salario <= 400.00) {
            percentual = 15.0;
        } 
        else if (salario <= 800.00) {
            percentual = 12.0;
        } 
        else if (salario <= 1200.00) {
            percentual = 10.0;
        } 
        else if (salario <= 2000.00) {
            percentual = 7.0;
        } 
        else { // Salário acima de 2000.00
            percentual = 4.0;
        }
        
        // 5. CÁLCULOS
        
        // Valor do reajuste ganho (Ex: 15% de 400.00 = 400.00 * 0.15)
        reajusteGanho = salario * (percentual / 100.0);
        
        // Novo salário = Salário Antigo + Reajuste Ganho
        novoSalario = salario + reajusteGanho;
        
        // 6. IMPRESSÃO DA SAÍDA FORMATADA
        // Usamos printf para formatar com duas casas decimais (%.2f) e o percentual com 0 casas decimais (%.0f).
        
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
        // O percentual deve ser impresso como um inteiro, seguido do símbolo '%'.
        System.out.printf("Em percentual: %.0f %%%n", percentual);
        
        // 7. Fecha o Scanner.
        sc.close();
    }
}