/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

public interface IContainer<T> {       
    public IIterator<T> createIterator();   
}
