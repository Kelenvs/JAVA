import java.util.Scanner;
import java.util.Locale;

public class Media3_1040 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double N4 = scanner.nextDouble();
        
        
        double media = (N1 * 2.0 + N2 * 3.0 + N3 * 4.0 + N4 * 1.0) / 10.0;
        
        
        media = Math.floor(media * 10) / 10.0;
        
        System.out.printf("Media: %.1f\n", media);
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            
            double notaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            
            double mediaFinal = (media + notaExame) / 2.0;
            mediaFinal = Math.floor(mediaFinal * 10) / 10.0;
            
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }
        
        scanner.close();
    }
}