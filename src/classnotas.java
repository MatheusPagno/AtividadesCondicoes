import java.util.Scanner;

public class classnotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = scanner.nextDouble();


        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else {
            System.out.println("Insatisfatório");
        }


        scanner.close();
    }
}

