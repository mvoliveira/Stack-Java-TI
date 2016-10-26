/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javabeans.Carta;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Matheus Varella de Oliveira
 * @GitHub mvoliveira
 */
public class PainelBusca extends JPanel implements ActionListener {

    private JLabel lblNameReceiver;
    private JLabel lblSearch;

    private JTextField txtNameReceiver;

    private ArrayList<Carta> dados;

    public PainelBusca(ArrayList dados) {
        this.dados = dados;

//    Labels
        lblSearch = new JLabel("Busca por destinatário");

        lblNameReceiver = new JLabel("Nome do destinatário");

        lblNameReceiver.setBounds(10, 50, 180, 20);
        
        lblSearch.setBounds(50, 10, 220, 20);

        this.add(lblNameReceiver);
        this.add(lblSearch);

//     TextField
        txtNameReceiver = new JTextField();

        txtNameReceiver.setBounds(10, 70, 200, 20);

        this.add(txtNameReceiver);

// Painel bounds
        this.setBounds(625, 10, 270, 280);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
