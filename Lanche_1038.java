import java.io.IOException;
import java.util.Scanner;

public class Lanche_1038 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        
        double preco = 0;
        
        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        }
        
        double total = preco * quantidade;
        
        System.out.printf("Total: R$ %.2f\n", total);
        
        scanner.close();
    }
}



// Ou ainda MAIS SIMPLES com switch:

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int codigo = scanner.nextInt();
//         int quantidade = scanner.nextInt();
//         double preco = 0;

//         switch (codigo) {
//             case 1: preco = 4.00; break;
//             case 2: preco = 4.50; break;
//             case 3: preco = 5.00; break;
//             case 4: preco = 2.00; break;
//             case 5: preco = 1.50; break;
//         }
        
//         double total = preco * quantidade;
//         System.out.printf("Total: R$ %.2f\n", total);
//         scanner.close();
//     }
// }