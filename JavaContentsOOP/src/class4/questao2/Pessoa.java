/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao2;

/**
 *
 * @author mauricio.moreira
 */
public class Pessoa {
    private int id;
    protected String nome;
    public Departamento departamento;
    
    public Pessoa(int id) {
        this.id = id;
        this.departamento = null;
    }
    
    protected int getId() {
        return this.id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDepartamento (Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void imprimirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + getId());
        System.out.println("Id departamento: " + departamento.getId());
        System.out.println("Nome descricao: " + departamento.descricao);
    }
}
