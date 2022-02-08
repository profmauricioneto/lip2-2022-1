/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import class2.Professor;

/**
 *
 * @author mauricio.moreira
 */
public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public Professor professor;
    
    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.professor = null;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public void addProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getNomeProfessor() {
        return this.professor.nomeProfessor;
    }
}
