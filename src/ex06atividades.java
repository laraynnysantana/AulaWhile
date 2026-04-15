import java.util.Scanner;

public class ex06atividades {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double i, soma = 0;
        int quantidade = 0;

        IO.println("Digite as notas (-1 para parar):");
        i = sc.nextDouble();

        while (i != -1) {
            soma += i;
            quantidade++;
            i = sc.nextDouble();
        }

        if (quantidade > 0) {
            IO.println("Média: " + (soma / quantidade));
        } else {
            IO.println("Nenhuma nota.");
        }
    }
}
