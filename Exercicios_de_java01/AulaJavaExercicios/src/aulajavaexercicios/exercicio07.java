/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajavaexercicios;

/**
 *
 * @author joaod
 */
import java.util.Scanner; 
public class exercicio07 {
    public static void main(String[] args) {
        
    Scanner NumeroTeclado = new Scanner(System.in);  
    System.out.println("Escreva o numero do seu teclado");

    int NumTecl = NumeroTeclado.nextInt();  
    int NumeroAntecessor;
    NumeroAntecessor = NumTecl - 1;
    System.out.println("O Número antecessor é :"+NumeroAntecessor); 
       
    
    }
}
