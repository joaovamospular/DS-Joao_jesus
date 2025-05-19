/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_exemplo;

public class App {
         public static void main(String[] args) throws Exception{
             
             
         Televisao minhaTv = new Televisao();
         
         minhaTv.ModeloTelevisao = "Semp";
         minhaTv.Canal = 4.1f;    
         
         minhaTv.LigarTelevisao();
         minhaTv.AumentarVolume();
         minhaTv.MudarModoImagem();
         minhaTv.DiminuirVolume();
         minhaTv.exibirInformacoes();
         
         
         
    
}
}