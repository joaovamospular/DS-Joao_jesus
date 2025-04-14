/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Matriz;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
            String[] nome = {"Volvo", "BMW", "Ford", "Mazda"};
    String[] sobrenome = {"da Silva", "dos Santos","de Souza", "Borba"};
 

    for (int i= 0; i < nome.length; i++)
    {
      System.out.println(nome[i]);
    }
    for (int j= 0; j < sobrenome.length; j++)
    {
      System.out.println(sobrenome[j]);
    }
    for (int z= 0; z < nome.length; z++)
    {
      System.out.println("Seu nome é: "+nome[z]+" "+sobrenome[z]);
    }

    }
  }


