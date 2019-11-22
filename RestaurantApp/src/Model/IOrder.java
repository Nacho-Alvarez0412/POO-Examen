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
public interface IOrder {   
   public double getPrice();
   public ArrayList<IOrder> getComponents();
   public String getDescription();
   public String getPricedDescription();
   public String getName();

}
