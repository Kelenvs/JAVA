import java.util.Scanner;
import java.io.IOException;

public class Sedex {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int L = scanner.nextInt();
        int P = scanner.nextInt();

        if(N <= A && N <= L && N <= P){
            System.out.println("S");
        } else{
            System.out.println("N");
        }
        scanner.close();
    }
}
