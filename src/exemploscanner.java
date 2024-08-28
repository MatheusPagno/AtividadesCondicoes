import java.util.Scanner;

public class exemploscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        Integer idade = 0;
        Double peso = 0.0;

        System.out.println("Escrava seu nome :");
        nome = sc.next();

        System.out.println("Informe sua idade :");
        idade = sc.nextInt();

        System.out.println("Informe seu peso :");
        peso = sc.nextDouble();

        System.out.println("nome :" + nome);
        System.out.println("idade :" + idade);
        System.out.println("peso");





    }
}
