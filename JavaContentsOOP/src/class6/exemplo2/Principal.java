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
public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(500);
        conta1.depositar(1000);
        System.out.println("Saldo atual: " + conta1.saldo());
        
        ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial(200);
        contaEspecial.depositar(1000);
        System.out.println("Saldo atual: " + contaEspecial.saldo());
    }
}
