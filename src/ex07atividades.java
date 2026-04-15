import java.util.Scanner;

public class ex07atividades {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um número: ");
        int numero = sc.nextInt();

        int num = 1;
        int i = 1;

        while (i <= numero) {
            num *= i;
            i++;
        }

        IO.println(numero + " = " + num);
    }
}


