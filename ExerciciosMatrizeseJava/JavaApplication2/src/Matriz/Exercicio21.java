/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;
import java.util.Scanner;
/**
 *
 * @author joaod
 */
public class Exercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        for (int d = 0;d < n.length;d++)
        {
            System.out.println("me diga um numero");
            n[d] = entrada.nextInt(); 
        }
        int x = n[variavel-1];
        for (int i = n.length-1;i != 0; i--)
        {
            
            n[i]= n[i-1];
        }
        n[0] = x;
        for (int e = 0;e<n.length;e++)
        {
            System.out.println("\n"+n[e]);
        }
    }
}
