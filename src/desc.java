import java.util.Scanner;

public class desc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();


        double percentualDesconto = 0;
        double valorDescontado;
        double valorFinal;


        if (valorOriginal > 500) {
            percentualDesconto = 20;
        } else if (valorOriginal >= 200) {
            percentualDesconto = 10;
        } else if (valorOriginal >= 100) {
            percentualDesconto = 5;
        } else {
            percentualDesconto = 0;
        }


        valorDescontado = valorOriginal * percentualDesconto / 100;
        valorFinal = valorOriginal - valorDescontado;


        System.out.printf("Valor Original: R$ %.2f%n", valorOriginal);
        System.out.printf("Percentual de Desconto: %.2f%%%n", percentualDesconto);
        System.out.printf("Valor Descontado: R$ %.2f%n", valorDescontado);
        System.out.printf("Valor Final: R$ %.2f%n", valorFinal);

    }
}
