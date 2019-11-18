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
public class PrototypeFactory implements IStrategy {
    Ball ball;

    public PrototypeFactory() {
        ball = null;
    }

    @Override
    public Ball generateBall(int speed) {
        if(ball == null || ball.speed != speed){
            System.out.println("Cree una nueva!");
            ball = new Ball(speed,new ImageIcon(getClass().getResource("/Images/Ball.png")));
        }
        return (Ball) ball.clone();
    }
}
