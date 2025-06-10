import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua Conta! ");
        int accountNumber = scanner.nextInt();

        System.out.print("Por favor, digite a Agência! ");
        String agency = scanner.next();

        System.out.print("Por favor, digite o seu Nome! ");
        String name = scanner.next();

        System.out.print("Por favor, digite o seu Saldo! ");
        float balance = scanner.nextFloat();

        scanner.close();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                name, agency, accountNumber, balance);
    }
}
