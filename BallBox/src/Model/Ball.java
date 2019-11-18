/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nacho
 */
public class Ball implements IPrototype {
    JLabel appereance;
    boolean xMove;
    boolean yMove;
    boolean xDirection;
    boolean yDirection;
    int speed;

    public Ball(int speed,ImageIcon icon){
        this.speed = speed;
        appereance = new JLabel();
        appereance.setIcon(icon);
        appereance.setBounds(100, 100, 50, 50);
        appereance.setVisible(true);
    }

    public JLabel getAppereance() {
        return appereance;
    }

    public void setAppereance(JLabel appereance) {
        this.appereance = appereance;
    }

    public boolean isxMove() {
        return xMove;
    }

    public void setxMove(boolean xMove) {
        this.xMove = xMove;
    }

    public boolean isyMove() {
        return yMove;
    }

    public void setyMove(boolean yMove) {
        this.yMove = yMove;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isxDirection() {
        return xDirection;
    }

    public void setxDirection(boolean xDirection) {
        this.xDirection = xDirection;
    }

    public boolean isyDirection() {
        return yDirection;
    }

    public void setyDirection(boolean yDirection) {
        this.yDirection = yDirection;
    }
    
    public int getX(){
        return appereance.getX();
    }
    
    public int gety(){
        return appereance.getY();
    }
    
    public void setLocation(int x, int y){
        appereance.setLocation(x, y);
    }

    @Override
    public IPrototype clone() {
        Ball clone = new Ball(this.speed,new ImageIcon(getClass().getResource("/Images/Ball.png")));
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        Ball clone = new Ball(this.speed,new ImageIcon(getClass().getResource("/Images/Ball.png")));
        clone.xDirection = this.xDirection;
        clone.xMove = this.xMove;
        clone.yDirection = this.yDirection;
        clone.yMove = this.yMove;
        return clone;
    }
    
    
    
    
}
