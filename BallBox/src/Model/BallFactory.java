/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nacho
 */
public class BallFactory {
    IStrategy strategy;
    
    
    public Ball getBall(int speed){
        return strategy.generateBall(speed);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    
}
