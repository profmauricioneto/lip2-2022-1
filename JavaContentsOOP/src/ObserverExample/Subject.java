/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class Subject {
    public List<Observer> observers = new ArrayList<>();
    
    /**
     * @param number - possible even number
     */
    public boolean isEven(int number) {
        boolean flag = false;
        if (number % 2 == 0) {
            flag = true;
        }
        return flag;
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyAllAttached() {
        for(Observer observer: observers) {
            observer.update();
        }
    }
}
