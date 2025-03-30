/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioswhile;
import java.util.Scanner;
/**
 *
 * @author joaod
 */
public class exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x = 1;
    int y = 100;
    int i = (x % 2 == 0) ? x + 1 : x; // o "? : " é um operador condicional
    while (i <= y) {
            System.out.print(i + " \n");
            i += 2; // faz ir de dois em dois
        
}
    }
}
