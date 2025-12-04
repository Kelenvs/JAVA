import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

public class Distancia_1016 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        int minutos = km * 2;
        
        System.out.println(minutos+" minutos");

        scanner.close();
    }
}
