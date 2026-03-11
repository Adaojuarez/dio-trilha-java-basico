import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da conta!");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome quebra de linha
        
        System.out.println("Digite o número da agência!");
        String numeroAgencia = scanner.nextLine();
        
        System.out.println("Digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo!");
        double saldo = scanner.nextDouble();
        
        System.out.println("\n==== Conta Criada com Sucesso ====");
        System.out.println("Ola: " + nomeCliente + ",obrigado por criar uma conta em nosso banco");
        System.out.println("A sua agência é: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("E seu saldo é: R$ " + saldo + " ja esta disponivel para saque");
        
        scanner.close();
    }
}