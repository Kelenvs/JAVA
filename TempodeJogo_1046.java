import java.util.Scanner;

public class TempodeJogo_1046  {
    public static void main(String[] args) {
        // 1. Cria o objeto Scanner para ler a entrada.
        Scanner sc = new Scanner(System.in);
        
        // 2. Lê a hora inicial e a hora final.
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        
        int duracao;
        
        // 3. LÓGICA DE CÁLCULO DA DURAÇÃO
        
        // CASO 1: O jogo começou e terminou no MESMO DIA (horaFinal > horaInicial).
        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } 
        
        // CASO 2: O jogo começou em um dia e terminou no OUTRO, OU durou exatamente 24 horas (horaFinal <= horaInicial).
        else {
            /*
             * A duração é a soma do tempo restante no primeiro dia (24 - horaInicial)
             * mais o tempo decorrido no segundo dia (horaFinal).
             * Esta fórmula (24 - horaInicial + horaFinal) funciona mesmo para o caso 
             * em que horaInicial == horaFinal (ex: 0 0), resultando em 24.
             */
            duracao = 24 - horaInicial + horaFinal;
        }
        
        // 4. IMPRESSÃO DA SAÍDA
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        
        // 5. Fecha o Scanner.
        sc.close();
    }
}