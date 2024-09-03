import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();


        if (media >= 7) {

            System.out.println("O aluno foi aprovado.");
        } else if (media >= 5) {

            System.out.println("O aluno está em recuperação.");
        } else {

            System.out.println("O aluno foi reprovado.");
        }

    }
}
