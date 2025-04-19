/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author joaod
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int [] vetor = {1,2,3,4,5,6,7,8,9,10};
        int contador = 0;
        int soma= 0;
        float media;
        
        for (int i = 0; i< vetor.length; i++){
            // soma de tudo
          soma += vetor[i];
         
          
        }
         // fazer a media, ou seja dividir a soma pelo número de casas 
          media = soma / vetor.length;
          
       for (int i = 0; i<vetor. length;i++){
       
           
           if(vetor[i]>media){
            contador++;
             System.out.println("há :"+contador+" maiores que a media que é :"+media+", esses numeros são: "+vetor[i]);
           }
       
       }
       
    }
}
