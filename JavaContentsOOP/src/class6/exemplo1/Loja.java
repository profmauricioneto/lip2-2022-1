/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6.exemplo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Loja {
    public static void main(String[] args) {
        Produto heman = new Brinquedo("Heman", 150);
        Produto bolaGugu = new Bola("Bola do Gugu", 50);
        
        heman.mostrarDados();
        heman.atualizar("Mestres do universo", 200);
        heman.mostrarDados();
        
        bolaGugu.mostrarDados();
        List<Double> arguments = new ArrayList<>();
    }
}
