/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here]
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite o lado o quadrado, entre 1 e 20");
      int lado = scanner.nextInt();
      
      if(lado >= 1 && lado <=20)
      {
          int i = 0;
          while(i<lado)
          { 
              int j = 0;
              while(j<lado)
              {
                  if(i == 0 || i == lado -1 || j ==0 || j ==lado-1)
                  {
                      System.out.print(" * ");
                  }else{
                      System.out.print("   ");
                  }
                  j++;
              }
              System.out.println();
              i++;
          }
          
      }
      else{
          System.out.print("Valor invalido. o tamnho deveria estar entre 1 e 20.");
      }
    }
}
