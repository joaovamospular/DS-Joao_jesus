/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int [] vetor = {1,2,3,4,5,6,7,8,9,10};
        int valor = 4; 
        
        for ( int i = 0; i< vetor.length; i++){
           
            if (vetor[i]> valor){
             System.out.println("Número maior que "+valor+": "+vetor[i]);
            } 
            
            
            
        }
        
    }
}
