import java.util.Scanner;

public class DDD_1050 {
    public static void main(String[] args) {
        // 1. Cria o objeto Scanner para ler a entrada.
        Scanner sc = new Scanner(System.in);
        
        // 2. Lê o código DDD.
        int ddd = sc.nextInt();
        
        String cidade;
        
        // 3. ESTRUTURA SWITCH-CASE
        // Verifica o valor do DDD e atribui a cidade correspondente.
        switch (ddd) {
            case 61:
                cidade = "Brasilia";
                break;
            case 71:
                cidade = "Salvador";
                break;
            case 11:
                cidade = "Sao Paulo";
                break;
            case 21:
                cidade = "Rio de Janeiro";
                break;
            case 32:
                cidade = "Juiz de Fora";
                break;
            case 19:
                cidade = "Campinas";
                break;
            case 27:
                cidade = "Vitoria";
                break;
            case 31:
                cidade = "Belo Horizonte";
                break;
            default:
                // Se o DDD não corresponder a nenhum dos cases acima.
                cidade = "DDD nao cadastrado";
                break;
        }
        
        // 4. IMPRIME O RESULTADO
        System.out.println(cidade);
        
        sc.close();
    }
}