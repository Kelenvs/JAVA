import java.util.Scanner;

public class TempodeumEvento_1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // --- 1. LEITURA DOS DADOS DE INÍCIO E FIM ---
        
        // Leitura do Dia Inicial
        // Lemos a string "Dia" (que é descartada) e depois o número do dia.
        String lixo1 = sc.next();
        int diaInicial = sc.nextInt();
        
        // Leitura do horário Inicial (HH : MM : SS)
        int horaInicial = sc.nextInt();
        String lixo2 = sc.next(); // :
        int minutoInicial = sc.nextInt();
        String lixo3 = sc.next(); // :
        int segundoInicial = sc.nextInt();
        
        // Leitura do Dia Final
        String lixo4 = sc.next(); // Dia
        int diaFinal = sc.nextInt();
        
        // Leitura do horário Final (HH : MM : SS)
        int horaFinal = sc.nextInt();
        String lixo5 = sc.next(); // :
        int minutoFinal = sc.nextInt();
        String lixo6 = sc.next(); // :
        int segundoFinal = sc.nextInt();
        
        // 2. CONVERSÃO PARA SEGUNDOS TOTAIS
        
        // O evento ocorre dentro do mês de Abril (30 dias). 
        // O dia 1 é o primeiro do mês. Usamos a duração em segundos desde o início do dia 1.
        
        // Cálculo do tempo de INÍCIO em segundos:
        // Segundos de Dias: (Dia - 1) * 24 * 60 * 60
        // Segundos de Horas: Horas * 60 * 60
        // Segundos de Minutos: Minutos * 60
        
        long inicioEmSegundos = (long)diaInicial * 24 * 60 * 60 + 
                                (long)horaInicial * 60 * 60 + 
                                (long)minutoInicial * 60 + 
                                segundoInicial;
                                
        // Cálculo do tempo de FIM em segundos:
        long fimEmSegundos = (long)diaFinal * 24 * 60 * 60 + 
                             (long)horaFinal * 60 * 60 + 
                             (long)minutoFinal * 60 + 
                             segundoFinal;
                             
        // 3. CÁLCULO DA DURAÇÃO TOTAL
        long duracaoTotalSegundos = fimEmSegundos - inicioEmSegundos;
        
        // 4. CONVERSÃO DA DURAÇÃO DE VOLTA PARA DIAS, HORAS, MINUTOS E SEGUNDOS
        
        long W, X, Y, Z; // Dias, Horas, Minutos, Segundos
        
        // W: Dias (Quociente da divisão por segundos em um dia)
        W = duracaoTotalSegundos / (24 * 60 * 60);
        
        // Resto dos segundos após calcular os dias.
        long restoSegundos = duracaoTotalSegundos % (24 * 60 * 60);
        
        // X: Horas (Quociente da divisão do resto por segundos em uma hora)
        X = restoSegundos / (60 * 60);
        
        // Resto dos segundos após calcular as horas.
        restoSegundos %= (60 * 60);
        
        // Y: Minutos (Quociente da divisão do novo resto por 60)
        Y = restoSegundos / 60;
        
        // Z: Segundos (O que restar, pois é o resto da divisão por 60)
        Z = restoSegundos % 60;
        
        // 5. IMPRESSÃO DA SAÍDA
        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");
        
        sc.close();
    }
}