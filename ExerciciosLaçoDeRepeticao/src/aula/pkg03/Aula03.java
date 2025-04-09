/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um Numero:");
        int numero = entrada.nextInt();
        
        for (int i = 0; i <= numero; i++)
        {
            System.out.println("O seu número é" + i);
        }
        for (int i = numero; i <= 10; i++)
        {
            System.out.println("O seu número é" + i);
        }
    }
}
