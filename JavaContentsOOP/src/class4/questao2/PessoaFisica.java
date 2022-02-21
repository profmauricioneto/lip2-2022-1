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
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int id) {
        super(id);
        this.cpf = "undefined";
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    
}
