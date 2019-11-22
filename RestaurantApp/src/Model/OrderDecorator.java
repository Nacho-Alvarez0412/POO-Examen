/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public abstract class OrderDecorator implements IOrder {
    
    private IOrder order;
    
    public OrderDecorator(IOrder order){
        this.order = order;
    }
    
    public IOrder getOrder(){
        return this.order;
    }

    public void setOrder(Order order){
        this.order = order;
    }
    
    public ArrayList<IOrder> getComponents() {
        return order.getComponents();
    }    

    @Override
    public double getPrice() {
        return order.getPrice();
    }

    @Override
    public String getDescription() {
        return order.getDescription();
    }

    @Override
    public String getName() {
        return order.getName();
    }
    
}
