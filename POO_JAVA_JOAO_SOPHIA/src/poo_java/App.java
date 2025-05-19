package poo_java;

public class App {
         public static void main(String[] args) throws Exception{
         Carro meuCarro = new Carro();
         
         meuCarro.Cor = "vermelho"; 
         meuCarro.Modelo = "HR-V";
         meuCarro.potencia = 2.0f;
         
         meuCarro.exibirInformacoes();
         meuCarro.acelerar();
         meuCarro.frear();
         meuCarro.abrirPorta();
         meuCarro.fecharPorta();
         }

}