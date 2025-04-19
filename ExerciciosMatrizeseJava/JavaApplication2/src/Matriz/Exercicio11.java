/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int[] vetor = {8,3,4,5,1,10,2,6,7,9};
        
       
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = menorvetor(vetor, i); 
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
        }

      
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

   
    private static int menorvetor(int[] vetor, int atual) {
        int menor = atual;
        for (int i = atual + 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[menor]) {
                menor = i;
            }
        }
        return menor;
    }
}

    

