/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6.exemplo1;

import java.math.BigInteger;

/**
 *
 * @author mauricio.moreira
 */
public abstract class Produto {
    public BigInteger id;
    public String nome;
    public double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public BigInteger getId() {
        return id;
    }
    public abstract void atualizar(String nome, double preco);
    public abstract void mostrarDados();
}
