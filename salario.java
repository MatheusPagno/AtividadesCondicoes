import java.util.Scanner;

public class salario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();


        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalhados = scanner.nextInt();


        double bonus = 0;
        double imposto = 0;
        double salarioLiquido;


        if (anosTrabalhados > 10) {
            bonus = salarioBruto * 0.10;
        } else if (anosTrabalhados >= 5) {
            bonus = salarioBruto * 0.05;
        }


        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000) {
            imposto = salarioBruto * 0.18;
        } else {
            imposto = salarioBruto * 0.10;
        }


        salarioLiquido = salarioBruto + bonus - imposto;


        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Bônus Recebido: R$ %.2f%n", bonus);
        System.out.printf("Imposto Descontado: R$ %.2f%n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);


    }
}
