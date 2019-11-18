/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author nacho
 */
public class FlyweightFactory implements IStrategy {
    ImageIcon icon;
    public FlyweightFactory(){
        icon = new ImageIcon(getClass().getResource("/Images/Ball.png"));
    }

    @Override
    public Ball generateBall(int speed) {
        return new Ball(speed,icon);        
    }
    
}
