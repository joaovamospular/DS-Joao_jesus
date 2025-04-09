/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Me de 10 numeros aleatorios");
        int i = 0;
        float numero_maior = 0;
        float segundo_maior = 0;
        while(i < 10)
        {
            i++;
                float numero = entrada.nextFloat();
                   if(numero > numero_maior)
                   {
                       numero_maior = numero;
                   }
                   
                   else if(numero < numero_maior)
                   {
                       if(segundo_maior < numero && numero < numero_maior)
                       {
                           segundo_maior = numero;
                       }
                   }
        }
        System.out.println("O maior numero é"+numero_maior);
        System.out.println("O segundo maior numero é"+segundo_maior);
    }
}
