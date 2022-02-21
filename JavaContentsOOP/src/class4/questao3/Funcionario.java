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
public class Funcionario extends Pessoa {
    
    private double salario;
    public List<Venda> vendas;
    
    public Funcionario(int codigoFuncionario, String nome) {
        super(codigoFuncionario);
        this.nome = nome;
        this.salario = 0;
    }
 
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addVenda(Venda venda) {
        this.vendas.add(venda);
    }
    
    public void removeVenda(Venda venda) {
        this.vendas.remove(venda);
    }
    
    public int qtdVendas() {
        return vendas.size();
    }
}
