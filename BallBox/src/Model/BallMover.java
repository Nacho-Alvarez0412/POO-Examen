/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nacho
 */
public class BallMover extends Thread {
    private Ball ball;
    private  int width;
    private  int height;
    
    public BallMover(Ball ball,int width,int height){
        this.ball = ball;
        this.width = width;
        this.height = height;
    }
    
    public void setNewDirection(){
        Random random = new Random();
        
        ball.xDirection = random.nextBoolean();
        ball.yDirection = random.nextBoolean();
        ball.xMove = random.nextBoolean();
        ball.yMove = random.nextBoolean();
        
    }
    
    public void changeDirection(){
        Random random = new Random();
        
        ball.xDirection = !ball.xDirection;
        ball.yDirection = !ball.yDirection;
        ball.xMove = random.nextBoolean();
        ball.yMove = random.nextBoolean();
        int x =ball.getX();
        int y = ball.gety();
        
        if(x<=0)
            x+=50;
        else if(x>=width-50)
            x+=50;
        
        if(y<=0)
            y+=50;
        else if(y>=width-50)
            y+=50;
        
        ball.setLocation(x, y);
    }
    
    public void run(){
        setNewDirection();
        
        if(!ball.xMove && !ball.yMove){
            if(ball.xDirection)
                ball.xMove = true;
            else
                ball.yMove = true;
        }
        
        while(true){
            int x = ball.getX();
            int y = ball.gety();
            
            if(x>0 && x<width-50 && y>0 && y<height-50){
                
                if(ball.xMove){
                    if(ball.xDirection)
                        x++;
                    else
                        x--;
                }
                if(ball.yMove){
                    if(ball.yDirection)
                        y++;
                    else
                        y--;
                }
                ball.setLocation(x, y);
            }
            else{
                changeDirection();
                    
                if(ball.xMove){
                    if(ball.xDirection)
                        x++;
                    else
                        x--;
                }
                if(ball.yMove){
                    if(ball.yDirection)
                        y++;
                    else
                        y--;
                }
                ball.setLocation(x, y);
            }
            
            try {
                sleep(1000/ball.speed);
            } catch (InterruptedException ex) {
                Logger.getLogger(BallMover.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
