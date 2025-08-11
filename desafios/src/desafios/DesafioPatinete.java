/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Importo java util Scanner para poder receber os dados e o arrays para organizar os numeros
package desafios;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author joaod
 */
public class DesafioPatinete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Uso o scanner para receber os numeros
        Scanner scanner = new Scanner(System.in);
       //enquanto sc
       
        for (int l = 0; l< 5; l++){
            int[] nums = new int[8];
            
            // Lendo 8 inteiros (2 linhas de 4 valores cada)
            for (int i = 0; i < 8; i++) {
                if (scanner.hasNextInt()) {
                    nums[i] = scanner.nextInt();
                } else {
                    return; // fim da entrada
                }
            }
            
            Arrays.sort(nums);
            
            int soma = 0;
            for (int n : nums) soma += n;
            int media = soma / 8; // divisão inteira arredonda para baixo
            
            // Imprime array ordenado
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) System.out.print(" ");
            }
            System.out.println(" - " + media);
        }
        
        scanner.close();
    }
    
}
