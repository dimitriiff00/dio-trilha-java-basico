import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Exibir as mensagens para o usuario
        //obter pelo scanner os valores digitados no terminal

        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite a Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do Titular: ");
        String titular = scanner.nextLine();

        System.out.println("Digite o saldo em conta: ");
        double saldo = scanner.nextDouble();

        //exibir as mensagens de conta criada
        System.out.println("Olá " + titular+"," + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +"," + " conta: " + conta + " e seu saldo de " + saldo + " já está disponível para saque");


    }

}
