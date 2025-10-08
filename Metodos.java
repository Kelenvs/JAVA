import java.util.Scanner;
public class Metodos {                         //aula métodos: exemplos de Metodos;
    public static int soma(int a, int b){
        return a+b;
    } 
    public static void exibirSoma(int a, int b){
        System.out.println("Resultado da soma: "+Metodos.soma(a, b));
    } 
    public static void main(String[] args) {
        Metodos.exibirSoma(4,5);
        int x = 5+4;
        System.out.println(x);
    }
}
