import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        int[] a = new int[1000000];
        for (int i = 0; i < 1000000; i++){
            a[i] = i;
        }
        System.out.println("Elementos do array: ");
        for (int i = 0; i < 1000000; i++){
            System.out.println("Item "+i+": "+a[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de elemento que deseja acessar: ");
        int n = input.nextInt();
        
    }

}