import java.util.Scanner;

public class ex08atividades {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite um numero");
        int numeroresposta = sc.nextInt();

        int contador = 0;
        int soma = 0;

        while (contador <= numeroresposta) {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }
        IO.println("soma: " + soma);
    }
}


