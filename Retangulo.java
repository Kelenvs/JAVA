import java.util.Scanner;

public class Retangulo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        int largura = scanner.nextInt();
        int area = altura*largura;
        System.out.println("A área do retângulo é: "+area+" metros quadrados.");
    }
}
