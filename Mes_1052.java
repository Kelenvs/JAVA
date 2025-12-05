import java.util.Scanner;

public class Mes_1052 {
    public static void main(String[] args) {
        // 1. Cria o objeto Scanner para ler a entrada.
        Scanner sc = new Scanner(System.in);
        
        // 2. Lê o valor inteiro (o número do mês).
        int mes = sc.nextInt();
        
        String nomeDoMes;
        
        // 3. ESTRUTURA SWITCH-CASE
        // Mapeia o número lido para o nome do mês em inglês, com a primeira letra maiúscula.
        switch (mes) {
            case 1:
                nomeDoMes = "January";
                break;
            case 2:
                nomeDoMes = "February";
                break;
            case 3:
                nomeDoMes = "March";
                break;
            case 4:
                nomeDoMes = "April";
                break;
            case 5:
                nomeDoMes = "May";
                break;
            case 6:
                nomeDoMes = "June";
                break;
            case 7:
                nomeDoMes = "July";
                break;
            case 8:
                nomeDoMes = "August";
                break;
            case 9:
                nomeDoMes = "September";
                break;
            case 10:
                nomeDoMes = "October";
                break;
            case 11:
                nomeDoMes = "November";
                break;
            case 12:
                nomeDoMes = "December";
                break;
            default:
                // Tecnicamente desnecessário, pois o problema garante entrada entre 1 e 12,
                // mas é boa prática ter um default.
                nomeDoMes = "Mes invalido";
                break;
        }
        
        // 4. IMPRIME O RESULTADO
        System.out.println(nomeDoMes);
        
        sc.close();
    }
}