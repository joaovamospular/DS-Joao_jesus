/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;

/**
 *
 * @author CAMARGO
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
             int[] ten = {2, 4,6,8,10,12,14,16,18,20};
             int j = 0;
        for ( int i = 0; i < ten.length; i++)
        {
            j+=ten[i];
            System.out.println("a soma é : "+j);
        }

    }
}
