/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.KitchenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author nacho
 */
public class KitchenController implements ActionListener , IObserver{
    Kitchen kitchen;
    KitchenView view;
    
    public KitchenController(Kitchen kitchen){
        this.kitchen = kitchen;
        view = new KitchenView();
        view.setVisible(true);
        kitchen.observers.add(this);
        setActionListeners();
    }
    
    public void setActionListeners(){
        view.ReadyButton.addActionListener(this);
        view.ShowButton.addActionListener(this);
    }

    @Override
    public void update() {
        System.out.println(kitchen.orders.size());
        view.jComboBox1.setModel(new DefaultComboBoxModel(kitchen.getOrdesToString().toArray()));
        view.repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.ShowButton)){
            int index = view.jComboBox1.getSelectedIndex();
            view.OrderJTextPane.setText(kitchen.orders.get(index).getDescription());
            view.jLabel3.setText("Client: "+kitchen.orders.get(index).getName());
        }
        
        if(e.getSource().equals(view.ReadyButton)){
            int index = view.jComboBox1.getSelectedIndex();
            try{
            kitchen.orders.remove(index);
            }catch(IndexOutOfBoundsException i){}
            view.OrderJTextPane.setText("Select and order to view...");
            kitchen.update();
        }
    }
}
