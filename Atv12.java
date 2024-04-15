import java.util.Scanner;
public class Atv12 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        if (isPalindromo(texto)) {
            System.out.println("A palavra/frase é um palíndromo.");
        } else {
            System.out.println("A palavra/frase não é um palíndromo.");
        }
        scanner.close();
    }

    public static boolean isPalindromo(String texto) {
        int esquerda = 0;
        int direita = texto.length() - 1;

        while (esquerda < direita) {
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}