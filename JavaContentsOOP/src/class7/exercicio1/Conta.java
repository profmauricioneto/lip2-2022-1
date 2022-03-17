/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.exercicio1;

/**
 *
 * @author maumneto
 */
public class Conta {
    private double saldo;
    
    public Conta(){
        this.saldo = 0;
    }
    
    public Conta(double valor) {
        this.saldo = valor;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Valor não pode ser sacado.");
        } else {
            this.saldo -= valor;
        }
    }
    public double consultar() {
        return saldo;
    }
}


