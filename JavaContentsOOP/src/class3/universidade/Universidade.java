/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3.universidade;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mauricio.moreira
 */
public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    public List<Curso> cursos;
    public Universidade(String nomeUniversidade, String descricao) {
        this.descricao = descricao;
        this.nomeUniversidade = nomeUniversidade;
        cursos = new ArrayList<>();
    }
    
    public String getNomeUniversidade() {
        return this.nomeUniversidade;
    }
    
    public String getCodigo() {
        return this.descricao;
    }
    
    public int getTotalCursos() {
        return this.cursos.size();
    }
    
    public void getNomeCursos() {
        for (Curso c: cursos) {
            System.out.println(c.getNomeCurso());
        }
    }
    
    public void addCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public int getTotalEstudantes() {
        int qtdEstudantes = 0;
        for(Curso c: cursos) {
            qtdEstudantes = qtdEstudantes + c.getEstudantes().size();
        }
        return qtdEstudantes;
    }   
}
