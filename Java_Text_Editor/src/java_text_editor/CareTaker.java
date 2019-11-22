/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text_editor;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author sebasgamboa
 */
public class CareTaker {
    private int currentIndex = -1;              
    private final Stack<TextMemento> states = new Stack<>();          
    
    public void addNewMemento(TextMemento m) {
        states.push(m);
        currentIndex++;       
    }       
    
    public TextMemento getCurrentMemento() {           
        return states.pop();
    }
    
    public TextMemento getNextMemento() {           
        int newIndex = currentIndex +1;           
        if( newIndex >= states.size()){               
            return null;           
        }
        
        currentIndex = newIndex;           
        return states.get(currentIndex);       
    }              
    
    public TextMemento getPreviousMemento() {           
        /*int newIndex = currentIndex-1;                      
        
        if(newIndex  <= -1 || newIndex >= states.size()-1){               
            return null;           
        }
        currentIndex= newIndex;
        
        
        return states.get(currentIndex);  */
        TextMemento t;
        try{
            t=states.pop();
        }catch(EmptyStackException e){
            t=null;
        }
        return t;
    }
}
