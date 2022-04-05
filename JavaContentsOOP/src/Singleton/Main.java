/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author maumneto
 */
public class Main {
    public static void main(String[] args) {
        SingletonExample sing = SingletonExample.getInstance();
        System.out.println(sing);
        SingletonExample sing2 = SingletonExample.getInstance();
        System.out.println(sing2);
        if(sing != sing2) {
            System.out.println("Singleton não funcionou");
        } else {
            System.out.println("Singleton funcionou");

        }

    }
}
