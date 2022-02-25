/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6.exemplo2;

/**
 *
 * @author mauricio.moreira
 */
public class ContaCorrente implements OperacoesBancarias {
    protected double montante;
    public ContaCorrente() {
        this.montante = 0;
    }
    public ContaCorrente(double montante) {
        this.montante = montante;
    }

    @Override
    public void depositar(double quantia) {
        montante = montante + quantia;
    }

    @Override
    public void sacar(double quantia) {
        if (quantia > montante + quantia*0.05) {
            System.out.println("Saldo insuficiente");
        } else {
            montante = montante - quantia;
        }
    }

    @Override
    public double saldo() {
        return montante;
    }
}
