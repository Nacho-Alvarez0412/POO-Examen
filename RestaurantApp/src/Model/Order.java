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
public class Order implements IOrder{
    private double price;
    private ArrayList<IOrder> order;
    private String description;
    private String owner;
    
    Order(String name){
        price = 0;
        order = new ArrayList<>();
        description = "";
        owner = name;
    }

    
    public void addCombo(IOrder combo){
        order.add(combo);
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public ArrayList<IOrder> getComponents() {
        return order;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return owner;
    }
    
    @Override
    public String getPricedDescription() {
        return description;
    }
    
}
