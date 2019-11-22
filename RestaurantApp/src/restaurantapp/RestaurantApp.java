/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantapp;

import Controller.WelcomeController;
import Model.Kitchen;
import Model.KitchenController;

/**
 *
 * @author nacho
 */
public class RestaurantApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        WelcomeController controller = new WelcomeController(kitchen);
        WelcomeController controller2 = new WelcomeController(kitchen);
        KitchenController kitchenController = new KitchenController(kitchen);
    }
    
}
