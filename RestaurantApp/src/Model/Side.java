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
public class Side extends OrderDecorator {
    String name ;
    Double price;
    
    public Side(IOrder order,String name,double price) {
        super(order);
        this.name = name;
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return getOrder().getPrice() + price;
    }

    @Override
    public ArrayList<IOrder> getComponents() {
        ArrayList<IOrder> components = getOrder().getComponents();
        components.add(this);
        return components;
    }

    @Override
    public String getName() {
        return getOrder().getName();
    }

    @Override
    public String getDescription() {
        return getOrder().getDescription()+"\n"+name;
    }
    
    @Override
    public String getPricedDescription() {
        return getOrder().getPricedDescription()+"\n"+name+"\t"+price+"\n";
    }
    
}
