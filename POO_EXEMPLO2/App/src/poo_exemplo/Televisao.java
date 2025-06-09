package poo_exemplo;

import javax.swing.JOptionPane;

public class Televisao {

    // variaveis da tvzinha
    String ModeloTelevisao;
    float Canal;
    String ModoDeImagem;
    int Volume;
    String LigadaOuDesligada;

    void LigarTelevisao() {
        String resposta = JOptionPane.showInputDialog("Voce quer liga a televisao? (sim/nao)").toLowerCase();

        if (resposta.equals("sim")) {
            LigadaOuDesligada = "Ligada";
            JOptionPane.showMessageDialog(null, "A TV tá " + LigadaOuDesligada);
        } else if (resposta.equals("nao")) {
            LigadaOuDesligada = "Desligada";
            JOptionPane.showMessageDialog(null, "blz, a tv fico " + LigadaOuDesligada);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "resposta invalida, programa vai pará");
            System.exit(0);
        }
    }

    void AumentarVolume() {
        Volume += 15;
        JOptionPane.showMessageDialog(null, ModeloTelevisao + " aumentou o volume, agora tá em: " + Volume);
    }

    void DiminuirVolume() {
        if (Volume >= 5) {
            Volume -= 5;
        } else {
            Volume = 0;
        }
        JOptionPane.showMessageDialog(null, ModeloTelevisao + " diminuiu o volume, agora ta em: " + Volume);
    }

    void MudarModoImagem() {
        ModoDeImagem = "Suave";
        String mudar = JOptionPane.showInputDialog("Quer muda o modo de imagem? (sim/nao)").toLowerCase();

        if (mudar.equals("sim")) {
            String novoModo = JOptionPane.showInputDialog("Escolhe ae: Normal, Esportes ou Usuario").toLowerCase();
            switch (novoModo) {
                case "normal":
                    ModoDeImagem = "Normal";
                    break;
                case "esportes":
                    ModoDeImagem = "Esportes";
                    break;
                case "usuario":
                    ModoDeImagem = "Usuário";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "modo n reconhecido, vamo deixa no suave msm");
            }
        } else {
            JOptionPane.showMessageDialog(null, "blz, modo continua como: " + ModoDeImagem);
        }
    }

    void exibirInformacoes() {
        String info = "Modelo da TV: " + ModeloTelevisao +
                "\nEstado: " + LigadaOuDesligada +
                "\nCanal: " + Canal +
                "\nVolume: " + Volume +
                "\nModo de imagem: " + ModoDeImagem;
        JOptionPane.showMessageDialog(null, info, "Info da TV", JOptionPane.INFORMATION_MESSAGE);
    }
}
