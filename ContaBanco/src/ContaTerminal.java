import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Por favor, digite o número da agência: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("\nNúmero da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("\nNome do cliente: ");
        String nome_cliente = scanner.nextLine();

        System.out.print("\nSaldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.\n\n", nome_cliente, agencia, numero, saldo);




    }
}
