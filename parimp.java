import java.util.Scanner;

public class parimp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Escrava um numero :");
        num = sc.nextInt();

        if (num % 2 == 0) {

            System.out.println(num + " é um número par.");
        } else {

            System.out.println(num + " é um número ímpar.");
        }
    }
}

