/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Departamento {
    private int id;
    public String descricao;
    public List<Pessoa> pessoas;
            
    public Departamento(int id) {
        this.id = id;
        pessoas = new ArrayList<Pessoa>();
    }
    
    public int getId() {
        return this.id;
    }
    
    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
}
