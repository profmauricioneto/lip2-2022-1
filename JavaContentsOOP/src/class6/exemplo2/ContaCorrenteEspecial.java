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
public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial() {
        super();
    }
    public ContaCorrenteEspecial(double montante) {
        super(montante);
    }
    
    @Override
    public void sacar(double quantia) {
        if (quantia > montante + quantia*0.01) {
            System.out.println("Saldo insuficiente");
        } else {
            montante = montante - quantia;
        }
    }
}
