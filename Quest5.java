import java.util.Scanner;

public class Quest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[7][7];
        int[] maioresLinhas = new int[7];
        int[] menoresColunas = new int[7];

        System.out.println("Informe os elementos da matriz:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            int maiorLinha = matriz[i][0];
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j] > maiorLinha) {
                    maiorLinha = matriz[i][j];
                }
            }
            maioresLinhas[i] = maiorLinha;
        }

        for (int j = 0; j < 7; j++) {
            int menorColuna = matriz[0][j];
            for (int i = 0; i < 7; i++) {
                if (matriz[i][j] < menorColuna) {
                    menorColuna = matriz[i][j];
                }
            }
            menoresColunas[j] = menorColuna;
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Maiores elementos das linhas: ");
        for (int value : maioresLinhas) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Menores elementos das colunas: ");
        for (int value : menoresColunas) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
