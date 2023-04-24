package Quest5;

import java.util.Scanner;

public class InverteString {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String texto = scan.nextLine();
            String textoInvertido = "";

            for (int i = texto.length() - 1; i >= 0; i--) {
                textoInvertido += texto.charAt(i);
            }

            System.out.println("A string invertida é: " + textoInvertido);
        }
}