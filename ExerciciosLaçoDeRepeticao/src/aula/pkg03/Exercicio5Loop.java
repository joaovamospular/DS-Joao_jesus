/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg03;

import java.util.Scanner;

public class Exercicio5Loop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char novo_calculo;

        do {
            System.out.println("Digite sua primeira nota");
            int nota1 = entrada.nextInt();

            System.out.println("Digite sua segunda nota");
            int nota2 = entrada.nextInt();

            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
                double media = (nota1 + nota2) / 2.0;
                System.out.println("A média das suas notas é: " + media);
            } else {
                System.out.println("Alguma das notas inseridas é inválida");
            }

            System.out.println("NOVO CÁLCULO (S/N)?");
            novo_calculo = entrada.next().toUpperCase().charAt(0);

        } while (novo_calculo == 'S');

        entrada.close();
    }
}