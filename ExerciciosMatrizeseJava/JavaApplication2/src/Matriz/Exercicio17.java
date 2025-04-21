/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
         int[] vetor = {20,19,18,4,3,2,6,5,1,7,17,16,13,14,12,11,10,9,8,15};
         
         for(int i = 0; i< vetor.length - 1; i++){
                
             for(int j = 0; j< vetor.length - 1; j++){
                 
                    if (vetor[j] > vetor[j + 1]) {
                    // troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                 }
             
             
             }
             
         
         }
          System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
    }
}
}