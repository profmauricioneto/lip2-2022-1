/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.exercicio1;

/**
 *
 * @author maumneto
 */
public class Testing {
    public static void main(String[] args) {
        Conta contaBancaria = new Conta(1000);
        System.out.println("Saldo: " + contaBancaria.consultar());
        contaBancaria.depositar(1000);
        System.out.println("Saldo: " + contaBancaria.consultar());
        contaBancaria.sacar(3000);
        System.out.println("Saldo: " + contaBancaria.consultar());
        
        Conta novaConta = new Conta();
        System.out.println("Saldo: " + novaConta.consultar());
        Math.sqrt(9);
        
    }
}
