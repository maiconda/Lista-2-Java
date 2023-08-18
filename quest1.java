package lista02;
import java.util.Scanner;

public class quest1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[1000];
		int num;
		int i = 0;
		
		do {
			System.out.print("Forneça um número inteiro e positivo diferente de 0: ");
			num = teclado.nextInt();
			if(num > 0) {
				numeros[i] = num;
				i++;
			}
		} while(num > 0);
		
		for(int j = 0; j < i; j++) {
			
			double cubo = Math.pow(numeros[j], 3);
			double raiz = Math.sqrt(numeros[j]);
			
			if(j % 20 == 0) {
				System.out.println("-------------------------------------------------");
				System.out.printf("%-25s%-15s%-10s\n", "Número", "Ao Cubo", "Raíz");
				System.out.println("-------------------------------------------------");
			}
		        System.out.printf("%-25d%-15.2f%-10.2f\n", numeros[j], cubo, raiz);
		}
	}
}