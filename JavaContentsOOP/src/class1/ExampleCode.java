/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

/**
 *
 * @author mauricio.moreira
 */
public class ExampleCode {
    public static void main(String[] args) {
        Pessoa mauricio = new Pessoa("Mauricio Moreira", 1990, 1.61f);
        mauricio.imprimirInfo();
        System.out.println("Idade: " + mauricio.calcularIdade());
    }
}
