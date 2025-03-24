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
public class RepetiçãoAula01_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um Numero: ");
        int numero = teclado.nextInt();
        
        while (numero <= 10){
        numero ++;     
    }
        System.out.println("O número é: " +numero++);
    }
}
