import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da AGÊNCIA: ");
        agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da CONTA: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o NOME do Cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o SALDO disponível para saque: ");
        saldo = sc.nextDouble();

        System.out.printf(
                "%nOlá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
