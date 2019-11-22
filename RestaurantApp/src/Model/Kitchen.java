/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nacho
 */
public class Kitchen implements IObservable{
    ArrayList<IOrder> orders;
    ArrayList<IObserver> observers;
    
    public Kitchen(){
        orders = new ArrayList<>();
        observers = new ArrayList<>();
    }
    
    public void addOrder(IOrder order){
        orders.add(order);
    }
    
    public IOrder getOrder(int i){
        return orders.get(i);
    }
    
    public void removeOrder(int i){
        orders.remove(i);
    }
    
    public ArrayList<String> getOrdesToString(){
        ArrayList<String> stringOrders = new ArrayList<>();
        
        for(IOrder order : orders){
            stringOrders.add(order.getName());
        }
        return stringOrders;
    }

    @Override
    public void update() {
        for(IObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserer(IObserver observer) {
        observers.remove(observer);
    }
    
}
