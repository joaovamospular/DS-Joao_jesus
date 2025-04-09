/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero1 = entrada.nextInt();
 
        System.out.println("Digite mais um numero");
        int numero2 = entrada.nextInt();
        while (numero2 == 0)
        {
            System.out.println("Zero e um 'VALOR INVALIDO'");
            numero2 = entrada.nextInt();
        }
        int divisao = numero1/numero2;
        System.out.println("O valor da divisao do primeiro pelo segundo é de:" +divisao);
    }
}
