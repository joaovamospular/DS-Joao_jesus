/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafios;
import java.util.Scanner;
/**
 *
 * @author joaod
 */

public class DesafioVacina {
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            int[] genes = new int[N];

            for (int i = 0; i < N; i++) {
                genes[i] = scanner.nextInt();
            }

            int alvo = scanner.nextInt();
            int contagem = 0;

            for (int gene : genes) {
                if (gene == alvo) {
                    contagem++;
                }
            }

            if (contagem > 1) {
                System.out.println("Achei o danado");
            } else if (contagem == 1) {
                System.out.println("Ainda não é suficiente");
            } else {
                System.out.println("Sumiu!");
            }
        }

        scanner.close();
}
}