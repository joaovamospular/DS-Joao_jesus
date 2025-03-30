/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicioswhile;
import java.util.Scanner;
/**
 *
 * @author joaod
 */
public class exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Numero = new Scanner(System.in);
        System.out.println("Escreva seu numero: ");
        int Y = Numero.nextInt();
        
  
    int xPar = 1;
    int i = (xPar % 2 == 0) ? xPar : xPar + 1; /* o "? : " é um operador condicional, então ele divide 
    o x pelo x e adiciona 1, oque faz sair o numero 2 */
    while (i <= Y) {
            System.out.print("Numero pares :"+i + " \n");
            i += 2; // faz ir de dois em dois, a partir do primeiro numero par!!
            
    }
     int x = 1;
    
    int i2 = (x % 2 == 0) ? x + 1 : x; // o "? : " é um operador condicional
    while (i2 <= Y) {
            System.out.print("numeros impares: "+i2 + " \n");
            i2 += 2; // faz ir de dois em dois
    }
    }
}
