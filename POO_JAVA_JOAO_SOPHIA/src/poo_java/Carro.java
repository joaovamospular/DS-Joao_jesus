package poo_.atividades.POO_JAVA_JOAO_SOPHIA.src.poo_java;

import javax.swing.JOptionPane;

public class Carro {

    // variavel q guarda as coisa do carro
    String Modelo;
    int ano;
    String Cor;
    float potencia;
    int velocidade;
    boolean portaAberta;

   // abre a porta ai se quiser senao nao da pra anda
   void abrirPorta() {
    int resposta = JOptionPane.NO_OPTION;
    while (resposta != JOptionPane.YES_OPTION) {
        resposta = JOptionPane.showConfirmDialog(
                null,
                "Você quer abrir a porta?(o davi brito abriria )",
                "Abrir a porta",
                JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            portaAberta = true; // porta foi abertaa
            JOptionPane.showMessageDialog(null, "Porta aberta! A viagem pode ser iniciada.");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Porta fechada! Não é possível iniciar a viagem.");
        }

        // se fecho a janelinha para tudo kk
        if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Janela fechada. Encerrando operação.");
            break;
        }
    }
}

    // fecha a porta se tiver aberta senao diz q ja ta fechada
    void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            JOptionPane.showMessageDialog(null, "A porta foi fechada. Pode começa o trajeto");
        } else {
            JOptionPane.showMessageDialog(null, "A porta ja ta fechada.");
        }
    }

    // acelera ai man
    void acelerar() {
        velocidade += 20;
        JOptionPane.showMessageDialog(null, Modelo + " acelerou. Velocidade atual: " + velocidade + " km/h");
    }

    // pisa no freio se tiver velo
    void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0; // para de vez
        }
        JOptionPane.showMessageDialog(null, "Freando Velocidade agora é: " + velocidade + " km/h");
    }

    // mostra as coisa do carro q foi colocado la em cima
    void exibirInformacoes() {
        String info = "Modelo: " + Modelo
                + "\nAno: " + ano
                + "\nCor: " + Cor
                + "\nVelocidade: " + velocidade + " km/h";
        JOptionPane.showMessageDialog(null, info, "Info do Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    // metodo main q roda tudo
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.Modelo = JOptionPane.showInputDialog("bota o modelo do carro:");
        carro.ano = Integer.parseInt(JOptionPane.showInputDialog("ano do carro ai:"));
        carro.Cor = JOptionPane.showInputDialog("qual cor do carro?");
        carro.velocidade = 0;

        carro.abrirPorta();
        carro.fecharPorta();
        carro.acelerar();
        carro.frear();
        carro.exibirInformacoes();
    }
}