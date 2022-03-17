/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.exercicio3;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author maumneto
 */
public class Testing {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("mauricio");
        System.out.printf("ID %s: %d \n", user1.getName(), Usuario.getId());
        Usuario user2 = new Usuario("joaozinho");
        System.out.printf("ID %s: %d \n", user2.getName(), Usuario.getId());
            
    }
}
