/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Ball;
import Model.BallFactory;
import Model.BallMover;
import Model.FlyweightFactory;
import Model.NullFactory;
import Model.PrototypeFactory;
import View.BallBoxView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nacho
 */
public class BallBoxController implements ActionListener{
    BallBoxView view;
    BallFactory factory;
    
    
    public BallBoxController(){
        view = new BallBoxView();
        view.GenerateButton.addActionListener(this);
        factory = new BallFactory();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.GenerateButton)){
            long startTime = System.currentTimeMillis();
            String mode = (String) view.CreationComboBox.getSelectedItem();
            
            switch(mode){
                case "Flyweight":
                    factory.setStrategy(new FlyweightFactory());
                    break;
                case "Prototype":
                    factory.setStrategy(new PrototypeFactory());
                    break;
                case "None":
                    factory.setStrategy(new NullFactory());
            }
            int cant = (int) view.BallsNumberSpinner.getValue();
            for(int i = cant ; i != 0 ; i--){
                Ball ball = factory.getBall((int)view.SpeedSpinner.getValue());
                view.BallBoxPannel.add(ball.getAppereance());
                view.validate();
                view.repaint();
                BallMover ballMover = new BallMover(ball, view.BallBoxPannel.getWidth(), view.BallBoxPannel.getWidth());
                ballMover.start();
            }
            
            long endTime = System.currentTimeMillis();
            System.out.println("---------------------------------------------");
            System.out.println("");
            System.out.println("Ball generated with "+mode+" pattern");
            System.out.println("Balls creted: "+ cant);
            System.out.println("Time elapsed: "+ (endTime-startTime));
            System.out.println("");
            System.out.println("---------------------------------------------");

        }
    }
    
}
