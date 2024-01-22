import java.util.Scanner; // Importa a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Exibir mensagens para o usuário
        System.out.println("Bem-vindo ao programa de criação de contas!");

        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Obter valores digitados no terminal
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine(); // Lê a linha digitada pelo usuário

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble(); // Lê o número digitado pelo usuário

        // Fechar o Scanner após o uso
        scanner.close();

        // Exibir mensagem de conta criada
        System.out.println("Conta criada para " + nomeTitular + " com saldo inicial de R$ " + saldoInicial);
    }
}
