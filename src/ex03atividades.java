import java.util.Scanner;

public class ex03atividades {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite um numero");
        int numero = sc.nextInt();

        int contador = 1;
        while (contador <= 10) {
            int resultado = numero * contador;
            IO.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }


        }
    }
