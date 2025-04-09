/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 10");
        int n = entrada.nextInt();
        int i = 1;
        
        if(n>=0 || n<=10)
        {
            while(i<=10)
            {
                System.out.println(n+" x "+i+" = "+(n*i));
                i++;
            }
        }
    }
}
