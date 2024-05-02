import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //conhecer e importar a classa Scanner

        //exibir as mensagens para o nosso usuário
        
        //obter pela scanner os valores digitados no terminal

        // exibir mensagem final

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número de sua Conta : ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente: ");
        String cliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
