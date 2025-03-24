/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package repetição;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class RepetiçãoAula01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // repetir ate o numero que eu quiser
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite ate que numero quer que o codigo escreva: ");
        
       
        
        int numero = entrada.nextInt();
        for (int i = 0; i<= numero; i++)
        {
            System.out.println("O seu numero é: "+ i);
        }
    }
}
