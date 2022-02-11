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
public class Curso {
    public String nomeCurso;
    public int codigo;
    public List<Estudante> estudantes;
    public Universidade universidade;
    
    public Curso(String nomeCurso, int codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.universidade = universidade;
        estudantes = new ArrayList<>();
    }
    
    public String getNomeCurso() {
        return this.nomeCurso;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void addEstudantes(Estudante estudante) {
        this.estudantes.add(estudante);
    }
    
    public List<Estudante> getEstudantes() {
        return this.estudantes;
    }   
}
