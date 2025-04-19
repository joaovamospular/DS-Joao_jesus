/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int[] vetor = {-4,-3,-2,-1,0,1,2,3,4,5};
        
        for ( int i = 0; i< vetor.length; i++){
          
          if (vetor[i] < 0){
              vetor[i]= 0;
              
          }
            System.out.println("O vetor ficara assim : "+vetor[i]);
        }
    }
}
