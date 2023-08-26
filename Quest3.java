import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        System.out.println("Informe os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Informe os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] vetorResultante1 = new int[vetor1.length];
        int[] vetorResultante2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {
                int soma = 0;
                for (int num2 : vetor2) {
                    soma += vetor1[i] + num2;
                }
                vetorResultante1[i] = soma;
            }

            if (vetor1[i] % 2 != 0) {
                int divisores = 0;
                for (int num2 : vetor2) {
                    if (vetor1[i] % num2 == 0) {
                        divisores++;
                    }
                }
                vetorResultante2[i] = divisores;
            }
        }

        System.out.print("Vetor Resultante 1: ");
        for (int value : vetorResultante1) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Vetor Resultante 2: ");
        for (int value : vetorResultante2) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
