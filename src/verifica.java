import java.util.Scanner;

public class  verifica {
    public static void main(String[] args) {

        String usuarioCorreto = "admin";
        String senhaCorreta = "123";


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome de usuário: ");
        String usuarioInput = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaInput = scanner.nextLine();


        if (usuarioCorreto.equals(usuarioInput) && senhaCorreta.equals(senhaInput)) {

            System.out.println("Login bem-sucedido!");
        } else {

            System.out.println("Nome de usuário ou senha incorretos.");
        }

    }
}
