/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int numero = 0;
        
        while(numero <= 100){
            numero+=1;
            
            if(numero%2 == 0)
            {
                System.out.println("numeros pares"+numero);
            }
        }
        System.out.println("---------------");
        numero = 0;
        while(numero < 100)
        {
            numero+=1;
            if(numero%2 != 0)
            {
                System.out.println("numeros impares"+numero);
            }
        }
    }
        
    }

