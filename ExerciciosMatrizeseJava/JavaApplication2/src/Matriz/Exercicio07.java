/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        float soma = 0;
        float media;
        for(int i = 0; i < vetor.length; i++){
              
           soma+= vetor[i];
           
                                             }
        media = soma / vetor.length;
        System.out.println("a media é "+media);
        System.out.println("a soma é: "+soma);
        
    }
}
