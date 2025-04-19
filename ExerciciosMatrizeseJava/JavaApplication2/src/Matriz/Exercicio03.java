/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here}
        
        int[] nums = {7,2,3,4,5};
        int menor = nums[1];
        int maior = nums[0];
        
        for (int i = 0; i< nums.length; i++ ){
            if (nums[i] < menor) {
                menor = nums[i]; 
                                 }
        if (nums[i] > maior){
                maior = nums[i];
                            }
        }
        System.out.println("O menor número é: "+ menor+"\nE o maior é: "+maior);
        
        
        
    
    }
}
