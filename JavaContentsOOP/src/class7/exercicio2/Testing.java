/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.exercicio2;

/**
 *
 * @author maumneto
 */
public class Testing {
    public static void main(String[] args) {
        Conta c = new Conta();
        System.out.println(c.getGeradorNum());
        Conta.changeGerador(100);
        System.out.println(c.getGeradorNum());
        Conta d = new Conta();
        System.out.println(d.getGeradorNum());
    }
}
