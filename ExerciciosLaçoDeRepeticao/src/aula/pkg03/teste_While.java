/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class teste_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número");
        int numero = teclado.nextInt();
        
        while (numero <= 10)
                {
                    System.out.println("Numero é:"+numero++);
                    
                }
        
        
    }
}
