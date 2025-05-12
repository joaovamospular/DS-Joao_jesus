/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_.atividades;

/**
 *
 * @author joaod
 */

// ** nome da classe, lembrando que a primeira letra sempre deve ser maiuscula. */
class Carro {
//**  diferente das outras atividades, se esse codigo tiver neste exato local"  public static void main(String args[])" */
//**  ele não funciona pois essa parte do codigo fica antes. */
    
        //**Declaração de variaveis, modelo é uma string */
        private String modelo;
        //** mais uma declaração de variavel, dessa vez ano é um inteiro */
        private int ano;
        
        
        /*  metodo/maneira de contruir parametros. Metodo construtor, oque é um metodo construtotror? é um metodo que é
        *   automaticamente chamado quando um objeto é criado, objeto esse que seria o carro, ele serve para inicializar os
        *   atributos do objeto (carro).
        */
        Carro (String m, int a){
        /* os atributos recebem valor aqui*/
        this.modelo = m;
        this.ano = a;
        }
        
        //** metodo/maneira para mostrar o resultado *//
        String mostrar() {
           return modelo + ano;
        
        }
      
      
      
      }


