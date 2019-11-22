package Controller;


import Model.Client;
import Model.Combo;
import Model.Kitchen;
import Model.Order;
import Model.ReceiptController;
import View.OrderView;
import View.ReceiptView;
import View.SiderView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacho
 */
class OrderController implements ActionListener{
    OrderView view;
    Client client;
    AddSiderController siderController;
    Kitchen kitchen;
    
    public OrderController(Client client,Kitchen kitchen){
        this.client = client;
        this.kitchen = kitchen;
        view = new OrderView(client.getName());
        view.setVisible(true);
        setActionLiseners();
    }
    
    public void setActionLiseners(){
        view.BigKingButton.addActionListener(this);
        view.ChickenNuggetsButton.addActionListener(this);
        view.RodeoBurgerButton.addActionListener(this);
        view.SaladButton.addActionListener(this);
        view.TexasTenderCrispButton.addActionListener(this);
        view.WhopperButton.addActionListener(this);
        view.WhopperJrButton.addActionListener(this);
        view.WhopperTexanButton.addActionListener(this);
        view.AddSider.addActionListener(this);
        view.ViewOrder.addActionListener(this);
        view.ConfirmButton.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.BigKingButton)){
            client.setOrder(new Combo( client.getOrder(),"Big King Combo", 4300));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        
        if(e.getSource().equals(view.RodeoBurgerButton)){
            client.setOrder(new Combo( client.getOrder(),"Rodeo Burguer Combo", 4500));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        
        if(e.getSource().equals(view.SaladButton)){
            client.setOrder(new Combo( client.getOrder(),"Healthy Combo", 2200));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        
        if(e.getSource().equals(view.ChickenNuggetsButton)){
            client.setOrder(new Combo( client.getOrder(),"Chicken Nuggets Combo", 3200));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        
        if(e.getSource().equals(view.TexasTenderCrispButton)){
            client.setOrder(new Combo( client.getOrder(),"Texas Tender Crisp Combo", 3200));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        if(e.getSource().equals(view.WhopperButton)){
            client.setOrder(new Combo( client.getOrder(),"Whopper Combo", 3200));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        
        if(e.getSource().equals(view.WhopperJrButton)){
            client.setOrder(new Combo( client.getOrder(),"Whopper Jr. Combo", 3200));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        
        if(e.getSource().equals(view.WhopperTexanButton)){
            client.setOrder(new Combo( client.getOrder(),"Whopper Texas Combo", 3200));
            JOptionPane.showMessageDialog(view, "Product added succesfully!!");
            System.out.println(client.getOrder().getDescription());
        }
        
        if(e.getSource().equals(view.AddSider)){
            siderController= new AddSiderController(client);
        }
        
        if(e.getSource().equals(view.ConfirmButton)){
            kitchen.addOrder(client.getOrder());
            kitchen.update();
            JOptionPane.showMessageDialog(view, "Order sent to kitchen, continue to pay");
        }
        
        if(e.getSource().equals(view.ViewOrder)){
            ReceiptController receiptController = new ReceiptController(client,kitchen);
        }
        
    }
    
}
