import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();


        System.out.print("Escolha a operação (+, -, x, /): ");
        String operacao = scanner.next().toLowerCase();


        double resultado;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case "x":
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida. Por favor, escolha entre adição, subtração, multiplicação, ou divisão.");
                break;
        }

    }
}
