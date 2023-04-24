package Quest5;

import java.util.Scanner;

public class InverteString {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String texto = scan.nextLine();
            StringBuilder textoInvertido = new StringBuilder();

            for (int i = texto.length() - 1; i >= 0; i--) {
                textoInvertido.append(texto.charAt(i));
            }

            System.out.println("A string invertida é: " + textoInvertido);
        }
}