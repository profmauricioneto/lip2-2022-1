/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class9.generics;

import java.util.Collections;

/**
 *
 * @author maumneto
 */
public class Example1 {
    public static < T > void showVector(T[] sequence) {
        for (T el: sequence) {
            System.out.println("Element: " + el);
        }
        System.out.println();
    } 
    
    public static < T extends Comparable<T>> T biggerThan(T[] sequence) {
        T max = sequence[0];
        for (T el: sequence) {
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Double sequenceDouble[] = {1.2, 2.1, 3.3, 3.6};
        Example1.showVector(sequenceDouble);
        
        Integer sequenceInteger[] = {1,2,3,4,5};
        Example1.showVector(sequenceInteger);
        
        Boolean sequenceBoolean[] = {true, false, true, false, false};
        Example1.showVector(sequenceBoolean);
        
        System.out.println(Example1.biggerThan(sequenceDouble));
    }
}
