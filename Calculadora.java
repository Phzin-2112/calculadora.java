import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#");

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1. Soma (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");

        int escolha = scanner.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + df.format(resultado));
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + df.format(resultado));
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + df.format(resultado));
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + df.format(resultado));
                } else {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
