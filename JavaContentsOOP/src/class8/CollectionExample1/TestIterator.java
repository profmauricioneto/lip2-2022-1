/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class8.CollectionExample1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class TestIterator {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        for (var i = 0; i < 10; i++) {
            list1.add(i);
        }
        for (var i = 11; i < 15; i++) {
            list2.add(i);
        }
        Iterator iterator = list1.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        System.out.println(Collections.disjoint(list1, list2));
        
//        list1.forEach(item->System.out.println(item));
    }
}
