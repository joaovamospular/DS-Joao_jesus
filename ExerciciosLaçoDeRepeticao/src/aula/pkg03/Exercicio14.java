/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double pais_a = 80000;
        double pais_b = 200000;
        double aumento_a = 1.03;
        double aumento_b = 1.015;
        
        int i= 0;
        while(pais_a <= pais_b)
        {
            pais_a= pais_a * aumento_a;
            pais_b= pais_b * aumento_b;
            System.out.println(pais_a+" = pais a "+pais_b+" = pais b "+i+" anos que demorou para o pais a ser maior ou igual o pais b");
            i++;
        }
    }
}
