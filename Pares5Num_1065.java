import java.io.IOException;
import java.util.Scanner;

public class Pares5Num_1065 {
     public static void main(String[] args) throws IOException {
        int cont = 0;
        int[] numeros = {2, 7, -4, 6, -5, 12};
            for(int i = 0; i < numeros.length; i++){
                int numero = numeros[i];
            if(numero % 2 == 0){
               cont++;
            }
        }
        System.out.println(cont + " valores pares");
    }
}