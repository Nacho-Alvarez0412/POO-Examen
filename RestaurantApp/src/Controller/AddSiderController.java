/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Client;
import Model.IOrder;
import Model.Order;
import Model.Side;
import View.SiderView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class AddSiderController implements ActionListener{
    Client client;
    SiderView view;

    public AddSiderController(Client client) {
        this.client = client;
        view = new SiderView();
        view.setVisible(true);
        view.jButton1.addActionListener(this);
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.jButton1)){
            String sider = (String) view.jComboBox1.getSelectedItem();
            
            IOrder order = client.getOrder();
            switch (sider){
                case "French Fries":
                    order = new Side( client.getOrder(), "French Fries", 900);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;
                
                case "Onion Rings":
                    order = new Side( client.getOrder(), "Onion Rings", 1400);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break; 
                    
                case "Hash Brown":
                    order = new Side( client.getOrder(), "Hash Brown", 1400);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;    
                    
                case "Sundae":
                    order = new Side( client.getOrder(), "Sundae", 700);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;   
                    
                case "Chicken Nuggets":
                    order = new Side( client.getOrder(), "Chicken Nuggets", 1200);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;
                    
                case "Beverage":
                    order = new Side( client.getOrder(), "Beverage", 600);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;
                    
                case "Chicken Fries":
                    order = new Side( client.getOrder(), "Chicken Fries", 1500);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;
                    
                case "BK Trio":
                    order = new Side( client.getOrder(), "BK Trio", 1600);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;
                    
                case "Cheese Cake":
                    order = new Side( client.getOrder(), "Cheese Cake", 1100);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break; 
                
                case "Burguer":
                    order = new Side( client.getOrder(), "Burguer", 2000);
                    JOptionPane.showMessageDialog(view, "Product added succesfully!!");
                    break;      
            }
            client.setOrder(order);
            System.out.println(client.getOrder().getDescription());
        }
    }
    
}
