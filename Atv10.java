import java.util.Scanner;
public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = scanner.nextDouble();
        
        System.out.print("Digite a taxa de desconto (em porcentagem): ");
        double taxaDesconto = scanner.nextDouble();
        
        // Convertendo a taxa de desconto de porcentagem para fração
        double desconto = valorOriginal * (taxaDesconto / 100);
        
        // Calculando o valor do produto com desconto
        double valorComDesconto = valorOriginal - desconto;
        
        System.out.println("Valor original do produto: R$" + valorOriginal);
        System.out.println("Desconto aplicado: R$" + desconto);
        System.out.println("Valor do produto com desconto: R$" + valorComDesconto);
        scanner.close();
    }
}