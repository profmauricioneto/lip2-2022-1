/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao3;

import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Cliente extends Pessoa {
    private String email;
    public List<Venda> vendas;
    
    public Cliente(int codigoCliente, String nome) {
        super(codigoCliente);
        this.nome = nome;
        this.email = null;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void addCompra(Venda venda) {
        this.vendas.add(venda);
    }
    
    public void removeVenda(Venda venda) {
        this.vendas.remove(venda);
    }
    
    public int qtdCompras() {
        return vendas.size();
    }
}
