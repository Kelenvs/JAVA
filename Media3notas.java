import java.util.Scanner;
import java.io.IOException;

public class Media3notas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double nota1 = scanner.nextDouble();
    double nota2 = scanner.nextDouble();
    double nota3 = scanner.nextDouble();
    double media = (nota1*2 + nota2*3 + nota3*5)/10.0;

    System.out.printf("MEDIA = %.1f%n", media); //controle de saída decimal, pelo número dentro da formula]

}
}