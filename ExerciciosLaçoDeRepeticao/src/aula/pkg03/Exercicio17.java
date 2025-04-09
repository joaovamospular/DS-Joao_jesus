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

public class Exercicio17{

    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que forneça um número
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        
        int fatorial = 1;
        int i = 1;
        while ( i <= numero) {
            fatorial *= i; 
            i++;
        }

        
        System.out.println("O fatorial de " + numero + " é " + fatorial + ".");

        
    }
}
