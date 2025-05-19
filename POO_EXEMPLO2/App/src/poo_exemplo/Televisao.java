/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package poo_exemplo;
import java.util.Scanner;

public class Televisao {

    // declaração das variaveis
    String ModeloTelevisao;
    float Canal;
    String ModoDeImagem;
    int Volume;
    String LigadaOuDesligada;

    // Scanner pra utilizar nos metodos
    Scanner TV = new Scanner(System.in);

    void LigarTelevisao(){

        System.out.println("Voce Deseja ligar a televisao? ");
        String TelevisaoOnOuOff = TV.nextLine ().toLowerCase();

        if(TelevisaoOnOuOff.equals("sim")){
            LigadaOuDesligada = "Ligada";
            System.out.println("A Televisao está: "+LigadaOuDesligada);
        }

        if(TelevisaoOnOuOff.equals("nao")){
            LigadaOuDesligada = "Desligada";
            System.out.println("A Televisao continuara"+LigadaOuDesligada);
            System.exit(0); // o programa vai parar se a resposta for não
        }
    }

    //Metodo para aumentar o volume da televisao
    void AumentarVolume(){
        Volume += 15;
        System.out.println(ModeloTelevisao+" Aumentou o volume, volume atual "+Volume);
    }

    //Metodo para diminuir o volume da televisao
    void DiminuirVolume () {
        if (Volume >=5){
            Volume -= 5;
        } else {
            Volume = 0;
        }
        System.out.println(ModeloTelevisao+" Diminui o volume, volume atual"+ Volume);
    }

    //metodo para mudar o modo de imagem
    void MudarModoImagem () {
        ModoDeImagem = "Suave";

        System.out.print("Deseja mudar o modo de imagem?  ");
        String SimOuNao = TV.nextLine().toLowerCase();

        if (SimOuNao.equals("sim")){

            System.out.println("Escolha o modo de imagem Normal, Esportes, Usúario: ");
            String Mododeimg = TV.nextLine ().toLowerCase();

            if (Mododeimg.equals("normal")){
                ModoDeImagem = "Normal";
            }
            if (Mododeimg.equals("esportes")){
                ModoDeImagem = "Esportes";
            }
            if (Mododeimg.equals("usúario")){
                ModoDeImagem = "Usúario";
            }

        }

        else {
            System.out.println("O modo de imagem ainda é "+ModoDeImagem);
        }
    }

    void exibirInformacoes() {
        System.out.println("Exibição das informações: \n");
        System.out.println("Modelo da Televisao : " + ModeloTelevisao);
        System.out.println("A Televisao está "+ LigadaOuDesligada);
        System.out.println("Canal: " + Canal);
        System.out.println("O volume da televisao é : "+ Volume);
        System.out.println("O modo de imagem é "+ ModoDeImagem);
    }

}