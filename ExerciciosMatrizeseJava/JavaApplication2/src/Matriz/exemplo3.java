/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class exemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here}
        Scanner entrada = new Scanner(System.in);
        String[] nome = new String[4];
        
        for( int i =0; i  < nome.length; i++ )
        {
            System.out.println("Escreva os nomes: "+ (i+i));
            nome[i] = entrada.nextLine();
        }
        System.out.println("Nomes: ");
        for( int i = 0; i < nome.length; i++)
        {
          
            System.out.println(" "+nome[i]);
        }
    }
}
