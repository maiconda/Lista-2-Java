import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] codigos = new int[10];
        double[] saldos = new double[10];

        System.out.println("Informe os códigos das contas:");
        for (int i = 0; i < 10; i++) {
            codigos[i] = scanner.nextInt();
        }

        System.out.println("Informe os saldos das contas:");
        for (int i = 0; i < 10; i++) {
            saldos[i] = scanner.nextDouble();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar ativo bancário");
            System.out.println("4. Finalizar programa");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Informe o código da conta: ");
                int codigo = scanner.nextInt();
                System.out.print("Informe o valor do depósito: ");
                double valor = scanner.nextDouble();
                int index = -1;
                for (int i = 0; i < codigos.length; i++) {
                    if (codigos[i] == codigo) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    saldos[index] += valor;
                    System.out.println("Depósito realizado com sucesso!");
                }
            } else if (choice == 2) {
                System.out.print("Informe o código da conta: ");
                int codigo = scanner.nextInt();
                System.out.print("Informe o valor do saque: ");
                double valor = scanner.nextDouble();
                int index = -1;
                for (int i = 0; i < codigos.length; i++) {
                    if (codigos[i] == codigo) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    if (saldos[index] >= valor) {
                        saldos[index] -= valor;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                }
            } else if (choice == 3) {
                double ativoBancario = 0;
                for (double saldo : saldos) {
                    ativoBancario += saldo;
                }
                System.out.println("Ativo bancário: " + ativoBancario);
            } else if (choice == 4) {
                System.out.println("Programa finalizado.");
                break;
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}
