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
public class PainelForm extends JPanel implements ActionListener {

    private JLabel lblNameSender;
    private JLabel lblAddress;
    private JLabel lblNameReceiver;

    private JTextField txtNameSender;
    private JTextField txtAddress;
    private JTextField txtNameReceiver;

    private ArrayList<Carta> dados;

    public PainelForm(ArrayList dados) {
        this.dados = dados;

//    Labels
        lblNameSender = new JLabel("Nome");
        lblAddress = new JLabel("Endereço");
        lblNameReceiver = new JLabel("Nome do destinatário");

        lblNameSender.setBounds(10, 10, 100, 20);
        lblAddress.setBounds(10, 50, 100, 20);
        lblNameReceiver.setBounds(10, 90, 180, 20);

        this.add(lblNameSender);
        this.add(lblAddress);
        this.add(lblNameReceiver);

        
//     TextField
        txtNameSender = new JTextField();
        txtAddress = new JTextField();
        txtNameReceiver = new JTextField();

        txtNameSender.setBounds(10, 30, 200, 20);
        txtAddress.setBounds(10, 70, 200, 20);
        txtNameReceiver.setBounds(10, 110, 200, 20);

        this.add(txtNameSender);
        this.add(txtAddress);
        this.add(txtNameReceiver);

        
// Painel bounds
        this.setBounds(10, 10, 300, 280);
        this.setLayout(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

