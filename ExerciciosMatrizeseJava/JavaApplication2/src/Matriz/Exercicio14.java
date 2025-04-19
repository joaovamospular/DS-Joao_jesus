/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i =0; i<vetor.length; i++){
        
          if(vetor[i]< 5){
          vetor[i] = 5;
          
          }
            System.out.println(""+vetor[i]);
                                          }
    }
}
