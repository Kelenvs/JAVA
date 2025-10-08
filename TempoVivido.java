import java.util.Scanner;

public class TempoVivido {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        int dias = idade*365;
        int horas = dias*24;
        int minutos = horas*60;
        System.out.println(idade+" anos equivalem a "+dias+" dias, "+horas+" horas e "+minutos+" minutos.");
    }
}
