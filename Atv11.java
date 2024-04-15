import java.util.Scanner;
import java.util.Random;
public class Atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"pedra", "papel", "tesoura"};

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");

        while (true) {
            System.out.print("Escolha sua jogada (pedra, papel ou tesoura): ");
            String escolhaUsuario = scanner.nextLine().toLowerCase();

            // Verifica se a escolha do usuário é válida
            if (!escolhaUsuario.equals("pedra") && !escolhaUsuario.equals("papel") && !escolhaUsuario.equals("tesoura")) {
                System.out.println("Escolha inválida. Por favor, escolha pedra, papel ou tesoura.");
                continue;
            }

            // Computador faz sua jogada
            int indiceComputador = random.nextInt(3);
            String escolhaComputador = opcoes[indiceComputador];

            System.out.println("O computador escolheu: " + escolhaComputador);

            // Verifica quem ganhou
            if (escolhaUsuario.equals(escolhaComputador)) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario.equals("pedra") && escolhaComputador.equals("tesoura")) ||
                    (escolhaUsuario.equals("papel") && escolhaComputador.equals("pedra")) ||
                    (escolhaUsuario.equals("tesoura") && escolhaComputador.equals("papel"))) {
                System.out.println("Você ganhou!");
            } else {
                System.out.println("Você perdeu!");
            }

            // Pergunta ao usuário se deseja jogar novamente
            System.out.print("Deseja jogar novamente? (sim/não): ");
            String resposta = scanner.nextLine().toLowerCase();
            if (!resposta.equals("sim")) {
                break;
            }
        }
        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}