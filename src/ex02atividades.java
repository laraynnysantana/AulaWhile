import java.util.Scanner;

public class ex02atividades {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println(" digite um numero:");
        int numerousuario = sc.nextInt();
        int resultado = 0;
        int contador = 1;

        while (contador <= numerousuario) {
            IO.println(contador);
            contador++;
        }
    }
}


