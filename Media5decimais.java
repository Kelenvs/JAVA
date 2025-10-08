import java.util.Scanner;
import java.io.IOException;
 
public class Media5decimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double media = ((nota1*3.5)+(nota2*7.5))/11.0;
       
        System.out.printf("MEDIA = %.5f%n", media);
          
    }
}
