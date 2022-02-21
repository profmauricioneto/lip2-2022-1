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
public class PessoaFisica extends Pessoa {
    public String rg;
    public String cpf;
    
    public PessoaFisica() {
        super();
        this.cpf = "undefined";
        this.rg = "undefined";
    }
    
    public PessoaFisica(String nome, String email, String rg, String cpf) {
        super(cpf, nome, email);
        this.cpf = cpf;
        this.rg = rg;
    }
}
