public class Main {
    public static void main(String[] args) {
        // O loop começa em 2 (o primeiro número par > 1).
        // Ele continua enquanto o número for menor ou igual a 100.
        // O incremento é de 2 (i += 2), garantindo que apenas números pares sejam impressos.
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}