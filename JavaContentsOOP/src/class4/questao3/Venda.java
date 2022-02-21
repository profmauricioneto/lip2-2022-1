/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao3;

import java.util.Date;

/**
 *
 * @author mauricio.moreira
 */
public class Venda {

    private int codigoVenda;
    public Date data;
    private String nomeProduto;
    private double preco;
    public Funcionario funcionario;
    public Cliente cliente;
    
    public Venda(int codigoVenda, Cliente cliente, Funcionario funcionario, double preco, String nomeString) {
        this.codigoVenda = codigoVenda;
        this.data = new Date();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.preco = preco;
        this.nomeProduto = nomeProduto;
    }
    
    public Date getDateVenda() {
        return data;
    }
    
    public int getCodigo() {
        return codigoVenda;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
