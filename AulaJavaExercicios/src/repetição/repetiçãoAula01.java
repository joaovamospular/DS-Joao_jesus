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
public class repetiçãoAula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // repetição ate o 10
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o seu numero: ");
        
       
        
        int numero = entrada.nextInt();
        for (int i = numero; i<= 10; i++)
        {
            System.out.println("O seu numero é: "+ i);
        }
    }
}
