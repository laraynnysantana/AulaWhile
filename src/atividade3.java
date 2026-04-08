import java.util.Scanner;

public class atividade3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero = 10;
        while (numero >= 0) {
            IO.println("acertou " + numero);

            numero--;
        }
    }
}