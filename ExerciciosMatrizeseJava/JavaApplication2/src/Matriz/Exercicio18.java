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
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        Scanner num = new Scanner (System.in);
        System.out.println("Escreva seu número : ");
        int numero = num.nextInt();
        
        int metade = vetor.length / 2;
        
        
        for(int i = 0; i < vetor.length; i++){
        
        if(numero == metade){
        numero = metade;
        
            System.out.println("seu número é :"+numero+"e está na casa"+vetor[i]);
            break;
        }
        if(numero > metade){
        numero = vetor[i];
            System.out.println("seu número é :"+numero+"e está na casa"+vetor[i]);
        break;
        }
        if(numero < metade){
        numero = vetor [i];
            System.out.println("seu número é :"+numero+"e está na casa"+vetor[i]);
        break;
        }
        
        
        }
        
    }
}
