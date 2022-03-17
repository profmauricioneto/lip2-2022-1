/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.exercicio2;

/**
 *
 * @author maumneto
 */
public class Conta {
    private int numCont;
    private double saldo;
    private static int geradorNum = 1;

    public Conta() {
    }
    
    public int getGeradorNum() {
        return geradorNum;
    }
    
    public static void changeGerador(int numberNew) {
        geradorNum = numberNew;
    }
}
