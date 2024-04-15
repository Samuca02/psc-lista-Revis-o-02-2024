import java.util.Scanner;
public class Atv15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double imposto;

        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075;
        } else if (salario <= 3751.05) {
            imposto = (salario - 2826.65) * 0.15 + 69.97;
        } else if (salario <= 4664.68) {
            imposto = (salario - 3751.05) * 0.225 + 69.97 + 138.95;
        } else {
            imposto = (salario - 4664.68) * 0.275 + 69.97 + 138.95 + 205.92;
        }

        System.out.println("O imposto de renda a ser pago é: R$" + imposto);
        scanner.close();
    }
}