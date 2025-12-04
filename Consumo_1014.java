import java.util.Scanner;
import java.util.Locale;

public class Consumo_1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        int km = scanner.nextInt();
        double gasolina = scanner.nextDouble();
        
        double consumo = km / gasolina;

        System.out.printf("%.3f km/l\n", consumo);

        scanner.close();
    }
}
