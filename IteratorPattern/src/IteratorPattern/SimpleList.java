/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

import java.util.LinkedList;

/**
 *
 * @author sebasgamboa
 */
public class SimpleList implements IContainer<Integer>{
    public Node firstNode;
    
    public SimpleList(){
        firstNode=null;
    }
    
    public void add(Node n){
        Node temp=firstNode;
        if(temp==null){
            firstNode=n;
        }
        else
        {
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }

    @Override
    public IIterator<Integer> createIterator() {
        return new SimpleListIterator();    
    }
    
    private class SimpleListIterator implements IIterator<Integer> {
        private LinkedList<Integer> list = new LinkedList<Integer>();                    
        private int index = 0;   
        
        public SimpleListIterator() {                        
            addRecursive(SimpleList.this);                    
        }
        
        public void addRecursive(SimpleList l) {
            Node temp=l.firstNode;
            while(temp!=null){
                list.add(temp.dato);
                temp=temp.next;
            }                  
        }                                
        
        @Override                    
        public boolean hasNext() {                        
            if (list.isEmpty()) {                            
                return false;                        
            }
            return index < list.size();
        }
        
        @Override                    
        public Integer next() {                        
            if (!hasNext()) {                            
                throw new RuntimeException("No hay más elementos");                        
            }
            return list.get(index++);                    
        }                
    }
}

