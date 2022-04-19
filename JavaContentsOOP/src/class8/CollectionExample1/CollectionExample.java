/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.CollectionExample1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author maumneto
 */
public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list_arraylist = new ArrayList<>();
        List<Integer> list_vector = new Vector<>();
        List<Integer> list_linkedlist = new LinkedList<>();
        // arraylist
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list_arraylist.add(i);
        }
        long stop = System.nanoTime();
        long diff_arraylist = stop - start;
        // vector
        long start2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list_vector.add(i);
        }
        long stop2 = System.nanoTime();
        long diff_vector = stop2 - start2;
        // linkedlist
        long start3 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list_linkedlist.add(i);
        }
        long stop3 = System.nanoTime();
        long diff_linkedlist = stop3 - start3;
        
        System.out.println("Tempo ArrayList: " + diff_arraylist);
        System.out.println("Tempo Vector: " + diff_vector);
        System.out.println("Tempo LinkedList: " + diff_linkedlist);
    }
}
