package Quest2;

import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = scan.nextInt();
            int fibonacci1 = 0;
            int fibonacci2 = 1;
            int fibonacciAtual = 0;
            boolean pertenceSequencia = false;

            while (fibonacciAtual < numero) {
                fibonacciAtual = fibonacci1 + fibonacci2;
                fibonacci1 = fibonacci2;
                fibonacci2 = fibonacciAtual;
                if (fibonacciAtual == numero) {
                    pertenceSequencia = true;
                    break;
                }
            }

            if (pertenceSequencia) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }
        }
}

