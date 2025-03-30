/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicioswhile;

/**
 *
 * @author joaod
 */
public class exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
         int x = 1;
    int y = 100;
    int i = (x % 2 == 0) ? x : x + 1; /* o "? : " é um operador condicional, então ele divide 
    o x pelo x e adiciona 1, oque faz sair o numero 2 */
    while (i <= y) {
            System.out.print(i + " \n");
            i += 2; // faz ir de dois em dois, a partir do primeiro numero par!!
    }
}
}
