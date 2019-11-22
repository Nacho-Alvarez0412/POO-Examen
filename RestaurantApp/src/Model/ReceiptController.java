/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.WelcomeController;
import View.ReceiptView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class ReceiptController implements ActionListener{
    Client client;
    ReceiptView view;
    Kitchen kitchen;
    
    public ReceiptController(Client client,Kitchen kitchen){
        this.client = client;
        view = new ReceiptView();
        this.kitchen = kitchen;
        printReceipt();
        view.setVisible(true);
        view.jButton1.addActionListener(this);
        
    }
    
    public void printReceipt(){
        view.ReceiptTextArea.setText("");
        view.ReceiptTextArea.append("\t Burguer King \n");
        view.ReceiptTextArea.append("-----------------------------\n");
        view.ReceiptTextArea.append("Order from: "+client.name+"\n");
        view.ReceiptTextArea.append("\n");
        view.ReceiptTextArea.append("Order: \n");
        view.ReceiptTextArea.append("\n");
        view.ReceiptTextArea.append(client.getOrder().getPricedDescription());
        view.ReceiptTextArea.append("\n");
        view.ReceiptTextArea.append("Total: "+client.getOrder().getPrice()+"\n");
        view.ReceiptTextArea.append("\n");
        view.ReceiptTextArea.append("Thanks for eating with us!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.jButton1)){
            JOptionPane.showMessageDialog(view, "Payment was succesful, move to cashier and wait your order");
            view.dispose();
        }
    }
    
}
