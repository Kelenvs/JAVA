import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int celsius = scanner.nextInt();
        int fahreinhiet = (celsius*9)/5+32;
        System.out.println(celsius+"°C equivale a "+fahreinhiet+"°F.");
    }
}
