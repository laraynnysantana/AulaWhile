import java.util.Scanner;

public class atividade2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ;
        int num = 1;
        while (num != 0) {
            IO.println("digite o numero");
            num = sc.nextInt();
            if (num % 2 == 0) {
                IO.println(" o numero é par");
            } else {
                IO.println("O numero é impar");
            }
        }

    }
}

