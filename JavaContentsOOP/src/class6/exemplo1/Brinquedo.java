/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6.exemplo1;

/**
 *
 * @author mauricio.moreira
 */
public class Brinquedo extends Produto {
    public Brinquedo(String nome, double preco) {
        super(nome, preco);
    }
    
    @Override
    public void atualizar(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Tipo: Brinquedo");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
    
}
