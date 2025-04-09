/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author Fernando
 */
import java.util.Scanner;
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        do{
        System.out.println("Digite um numero n(>0)");
        n = entrada.nextInt();
        if(n <= 0 )
        {
            System.out.println("VALOR INVALIDO! tente novamente");
        }
        }
        while(n <= 0 );
        System.out.println("contando de 1 a "+n);
        
                
                    
                
    }
}
