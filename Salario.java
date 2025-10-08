import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Salario {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.00");
        int func = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorhora= scanner.nextDouble();
        double salario = (horas*valorhora);
        System.out.println("NUMBER = "+func);
        System.out.println("SALARY = U$ "+(df.format((salario))));
    }
}
