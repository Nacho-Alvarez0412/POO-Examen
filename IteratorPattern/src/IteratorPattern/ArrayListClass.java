/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author sebasgamboa
 */
public class ArrayListClass implements IContainer<Integer>{
    public ArrayList<Integer> arrayList=new ArrayList<>();
    
    @Override
    public IIterator<Integer> createIterator() {
        return new ArrayListIterator();    
    }
    
    private class ArrayListIterator implements IIterator<Integer> {
        private LinkedList<Integer> list = new LinkedList<Integer>();                    
        private int index = 0;   
        
        public ArrayListIterator() {                        
            addRecursive(ArrayListClass.this);                    
        }
        
        public void addRecursive(ArrayListClass l) {
            for(Integer i:l.arrayList){
                list.add(i);
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
