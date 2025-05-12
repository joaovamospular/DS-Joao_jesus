/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_.atividades;

/**
 *
 * @author joaod
 */
public static void main (String[] args){
mostrar Mycar = new mostrar ("Civic", 2000, 2.0, 20000, "Azul");
mostrar.printLn();
}

// ** nome da classe, lembrando que a primeira letra sempre deve ser maiuscula. */
class Carro {
//**  diferente das outras atividades, se esse codigo tiver neste exato local"  public static void main(String args[])" */
//**  ele não funciona pois essa parte do codigo fica antes. */
    
        //**Declaração de variaveis, modelo é uma string */
        private String modelo;
        //** mais uma declaração de variavel, dessa vez ano é um inteiro */
        private int ano;
        private int potencia;
}
        /*  metodo/maneira de contruir parametros. Metodo construtor, oque é um metodo construtotror? é um metodo que é
        *   automaticamente chamado quando um objeto é criado, objeto esse que seria o carro, ele serve para inicializar os
        *   atributos do objeto (carro).
        */
        Carro (String m, int a, int p){
        /* os atributos recebem valor aqui*/
        this.modelo = m;
        this.ano = a;
        this.potencia= p;
    
        }
// declarandos as atributos 
public String getmodelo(){
  return modelo;
}
public int getpotencia(){
 return potencia;
}
public int getano(){
return ano;
}

/*subclass pra mostrar os resultados dos metodos*/
class mostrar extends Carro{
         private int kmrodado;
         private String Cor; 


        //** metodo/maneira para declarar os resultados*//
        public mostrar( String m, int a, int p, int k, String, c) {
           //** super está puxando as informações do class principal
           super( m, p, a);

        this.kmrodado = k;
        this.Cor = c;
           

        
        }
 //** revelar as variaveis e strings
    public void print(){
   System.out.PrintLn (getmodelo() + " " + getano() +" "+ getpotencia() +""+ kmrodado + "" + Cor)
    }
}   
 
      
 


