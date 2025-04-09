/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe a quantidade de numeros que voce deseja imprimir");
        int numero_infor = entrada.nextInt();
        int maior_n = 0;
        int menor_n = Integer.MAX_VALUE;
        int soma = 0;
        for(int i = 1;i<=numero_infor;i++)
        {
            System.out.println("imprima o "+i+" numero");
            int n = entrada.nextInt();
            if(n>maior_n)
            {
                maior_n = n;
                
            }
            if(n<menor_n)
            {
                menor_n = n;
            }
            soma +=n;
        }
        System.out.println(maior_n);
        System.out.println(menor_n);
        System.out.println(soma);
    }
}
