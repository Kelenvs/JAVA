import java.util.Scanner;

public class TempodeJogocomMinutos_1047 {
    public static void main(String[] args) {
        // 1. Cria o objeto Scanner.
        Scanner sc = new Scanner(System.in);
        
        // 2. Lê os quatro valores inteiros.
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        
        // Variáveis para a duração final.
        int duracaoHoras;
        int duracaoMinutos;
        
        // 3. CONVERSÃO PARA MINUTOS TOTAIS
        // Converte a hora de início e de fim para o total de minutos desde a meia-noite (00:00).
        int inicioEmMinutos = (horaInicial * 60) + minutoInicial;
        int fimEmMinutos = (horaFinal * 60) + minutoFinal;
        
        int duracaoTotalEmMinutos;
        
        // 4. CÁLCULO DA DURAÇÃO TOTAL EM MINUTOS
        
        // CASO 1: O jogo terminou no mesmo dia (ou a duração total é de 24 horas exatas).
        if (fimEmMinutos > inicioEmMinutos) {
            duracaoTotalEmMinutos = fimEmMinutos - inicioEmMinutos;
        } 
        // CASO 2: O jogo cruzou a meia-noite (início > fim, ou início == fim, que significa 24h).
        else {
            /* * A duração é o tempo restante do dia (24 * 60) menos o início, 
             * somado ao tempo decorrido no segundo dia (fimEmMinutos).
             * 24 horas = 1440 minutos.
             */
            duracaoTotalEmMinutos = (24 * 60 - inicioEmMinutos) + fimEmMinutos;
        }
        
        // 5. TRATAMENTO DO CASO 24 HORAS (7 7 7 7)
        // O problema define que se a duração for 0 minutos (após o cálculo acima), deve ser 24h.
        // A lógica do passo 4 já cobre isso, pois (1440 - A) + A = 1440.
        // No entanto, se o resultado fosse 0 por algum motivo, ele deve ser 1440 minutos (24 horas).
        if (duracaoTotalEmMinutos == 0 && (horaInicial != horaFinal || minutoInicial != minutoFinal)) {
            // Este bloco é tecnicamente desnecessário com a lógica acima, 
            // mas garante o caso mínimo de 1 minuto, que a lógica padrão resolve.
            // Para (7 7 7 7), o cálculo é (1440 - 427) + 427 = 1440, então o caso A=B=24h já está resolvido.
        }
        
        // 6. CONVERSÃO DA DURAÇÃO TOTAL DE VOLTA PARA HORAS E MINUTOS
        
        // Horas: O quociente da divisão por 60.
        duracaoHoras = duracaoTotalEmMinutos / 60;
        
        // Minutos: O resto da divisão por 60.
        duracaoMinutos = duracaoTotalEmMinutos % 60;
        
        // 7. IMPRESSÃO DA SAÍDA
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        
        // 8. Fecha o Scanner.
        sc.close();
    }
}
