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
public interface IObservable {
   
    public void update();
    public void addObserver(IObserver observer);
    public void removeObserer(IObserver observer);
}
