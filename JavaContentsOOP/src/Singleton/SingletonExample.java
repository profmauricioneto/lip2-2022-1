/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author maumneto
 */
public class SingletonExample {
    private static SingletonExample instance;
    
    private SingletonExample() {}
    
    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
