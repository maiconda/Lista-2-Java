package lista02;
import java.util.Scanner;

public class quest2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[] numeros1 = {3, 5, 7, 8, 6};
        int[] numeros2 = {2, 3, 9, 8, 1};
        int[] numeros3 = new int[10];
        
        int count = 0;
        
        for(int i = 0; i < numeros1.length; i++) {
            int existe1 = 0;
            int existe2 = 0;
            for(int j = 0; j < count; j++) {
                if(numeros1[i] == numeros3[j]) {
                    existe1 = 1;
                }
                if(numeros2[i] == numeros3[j]) {
                    existe2 = 1;
                }
            }
            
            if(existe1 == 0 && numeros1[i] != numeros2[i]) {
                numeros3[count] = numeros1[i];
                count++;
            }
            
            if(existe2 == 0 && numeros1[i] != numeros2[i]) {
                numeros3[count] = numeros2[i];
                count++;
            } 
            
            if(existe2 == 0 && numeros1[i] == numeros2[i]) {
                numeros3[count] = numeros2[i];
                count++;
            } 
            
        }
        
        for(int k = 0; k < count; k++) {
            System.out.printf("%d ", numeros3[k]);
        }
    }
}
