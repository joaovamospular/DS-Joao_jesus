/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;
import java.util.Scanner;
public class Carro {
    
// declaração das variaveis
    String Modelo;
    int ano;
    String Cor;
    float potencia;
    int velocidade;
    boolean portaAberta;

    
       
    
   // declaração de metodos
    void abrirPorta () {
        portaAberta = true;
        System.out.println(Modelo + " abriu a porta. Atualmente ela está aberta: " + portaAberta + ". O carro não ligará.");
    }
   // declaração de metodos
    void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println("A porta está fechada, pode começar o trajeto.\n");
        } else {
            System.out.println("A porta já está fechada.\n");
        }
    }
    
    // declaração de metodos
    void acelerar(){
        
      velocidade += 20;
        System.out.println(Modelo+" Acelerou, velocidade atual "+velocidade+" km/h");
     }
    // declaração de metodos
    void frear() {
            if (velocidade >= 10) {
                velocidade -= 10;
            } else {
                velocidade = 0;
            }
            System.out.println("Freando... Velocidade atual:  " + velocidade + " km/h");
        }
    
    
    
   

     // declaração de metodos
    void exibirInformacoes() {
            System.out.println("Modelo: " + Modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + Cor);
            System.out.println("Velocidade: " + velocidade + " km/h");
        }
    
    
}

        
    
    

