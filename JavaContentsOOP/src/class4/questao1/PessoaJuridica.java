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
public class PessoaJuridica extends Pessoa {
    public String cnpj;
    public String ie;
    
    public PessoaJuridica() {
        super();
        this.cnpj = "undefined";
        this.ie = "undefined";
    }
    
    public PessoaJuridica(String nome, String email, String cnpj, String ie) {
        super(cnpj, nome, email);
        this.cnpj = cnpj;
        this.ie = ie;
    }
}
