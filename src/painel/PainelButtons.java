/*
Botões:

Inserir'Correspondência

Remover'

Verificar

Entregar

Quantidade

Sair
 */
package painel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javabeans.Carta;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import stack.Stack;

/**
 *
 * @author Matheus Varella de Oliveira
 * @GitHub mvoliveira
 */
public class PainelButtons extends JPanel implements ActionListener {

    private JButton btnInsert;
    private JButton btnRemove;
    private JButton btnVerify;
    private JButton btnDeliver;
    private JButton btnSize;
    private JButton btnExit;

    private ArrayList<Carta> dados;

    public PainelButtons(ArrayList dados) {
        this.dados = dados;

//        Buttons
        btnInsert = new JButton("Inserir carta");
        btnRemove = new JButton("Remover carta");
        btnVerify = new JButton("Verificar próxima carta");
        btnDeliver = new JButton("Entregar carta");
        btnExit = new JButton("Sair");

        btnInsert.setBounds(10, 10, 280, 30);
        btnRemove.setBounds(10, 50, 280, 30);
        btnVerify.setBounds(10, 90, 280, 30);
        btnDeliver.setBounds(10, 130, 280, 30);
        btnExit.setBounds(10, 170, 280, 30);
        
        this.add(btnInsert);
        this.add(btnRemove);
        this.add(btnVerify);
        this.add(btnDeliver);
        this.add(btnExit);

        this.setBounds(320, 10, 300, 280);
        this.setLayout(null);
        this.setVisible(true);

}

    public void actionPerformed(ActionEvent e) {
/*@*/
}
}


