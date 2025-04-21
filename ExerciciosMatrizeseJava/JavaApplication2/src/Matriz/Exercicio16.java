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
public class Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        Scanner numerobuscado = new Scanner(System.in);
        System.out.println("Qual o numero buscado? ");
        int NumBusc = numerobuscado.nextInt();
        
        
        
        for(int i = 0; i< vetor.length; i++){ 
          if(vetor[i] == NumBusc){
             
              System.out.println("o número buscado está na posição: "+i);
          
          }
            
                                            }
    }
}
