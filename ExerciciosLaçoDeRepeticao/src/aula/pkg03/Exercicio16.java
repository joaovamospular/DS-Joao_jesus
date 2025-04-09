/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
public class Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int n1 = 1;
        int n2 = 1;
        int r = 1;
        int i = 0;
        while(n1<500)
        {
          System.out.println(r);
        r = n1 + n2;
        n1 = n2;
        n2 = r ;
        
        i++;
        }
    }
}
