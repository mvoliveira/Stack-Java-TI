package tela;

import javabeans.Carta;
import painel.PainelButtons;
import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import painel.PainelBusca;
import painel.PainelForm;
import stack.Stack;

public class Tela extends JFrame {

    PainelButtons painel;
    PainelForm painelLabels;
    PainelBusca painelBusca;
    /**
     *
     */
    public Tela() {
        Stack dados = new Stack();

        Container fundo = this.getContentPane();
        fundo.setBackground(Color.darkGray);
        painel = new PainelButtons(dados);
        fundo.add(painel);
        painelLabels = new PainelForm(dados);
        fundo.add(painelLabels);
        painelBusca = new PainelBusca(dados);
        fundo.add(painelBusca);

        this.setSize(900, 300);
        this.setTitle("Correio");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

}
