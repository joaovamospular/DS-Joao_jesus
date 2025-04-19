/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
         int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        int j = vetor.length - 1;

        while (i < j) {
            
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;

            i++;
            j--;
        }

     
        System.out.print("Vetor invertido: ");
        for (int num : vetor) {
            System.out.print(num + " ");
           }
    }
}
