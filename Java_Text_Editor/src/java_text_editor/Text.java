/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text_editor;

/**
 *
 * @author sebasgamboa
 */
public class Text implements Cloneable{
    public String text;
    
    public Text(String s){
        this.text=s;
    }
    
    public TextMemento createMemento(){           
        try {               
            return new TextMemento((Text)this.clone());           
        } catch (Exception e) {               
            throw new RuntimeException("Error al clonar el texto");           
        }       
    }              
    
    public void restoreMemento(TextMemento memento){           
        Text text = memento.getMemento();           
        this.text=text.text;    
    }   
}
