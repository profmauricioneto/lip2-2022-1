/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao1;

/**
 *
 * @author mauricio.moreira
 */
public class Pessoa {
    private String id;
    protected String nome;
    public String email;
    
    public Pessoa() {
        this.id = "undefined";
        this.nome = "undefined";
        this.email = "undefined";
    }
    
    public Pessoa(String id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void informarDados() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }
}
