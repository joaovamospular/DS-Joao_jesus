/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Solicitar o tamanho do lado do quadrado
        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanho = scanner.nextInt();
        
        
        int i = 0 ;
        // Garantir que o tamanho esteja entre 1 e 20
        if (tamanho >= 1 && tamanho <= 20) {
            // Loop para imprimir o quadrado de asteriscos
            while (i < tamanho) {
                int j = 0;
                while ( j < tamanho) 
                {
                    j++;
                    System.out.print(" * ");
                }
                i++;
                System.out.println(); // Nova linha após cada linha de asteriscos
            }
        } else {
            System.out.println("Tamanho inválido. O valor deve estar entre 1 e 20.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
