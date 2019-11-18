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
public class NullFactory implements IStrategy {
    

    public NullFactory() {
        
    }

    @Override
    public Ball generateBall(int speed) {
        return new Ball(speed,new ImageIcon(getClass().getResource("/Images/Ball.png")));
    }
    
}
