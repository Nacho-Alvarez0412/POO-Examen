package Controller;


import Controller.OrderController;
import Model.*;
import View.WelcomeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacho
 */
public class WelcomeController implements ActionListener {
    WelcomeView view;
    Client client;
    OrderController nxtController;
    Kitchen kitchen;
    
    public WelcomeController(Kitchen kitchen){
        client = new Client();
        view = new WelcomeView();
        view.setVisible(true);
        this.kitchen = kitchen;
        
        view.StartButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(view.StartButton)){
            client.setName(view.UsernameTextField.getText());
            client.setOrder();
            nxtController = new OrderController(client,kitchen);
            view.dispose();
        }
    }
    
    
}
