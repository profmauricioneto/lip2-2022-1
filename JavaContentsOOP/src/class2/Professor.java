/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author mauricio.moreira
 */
public class Professor {
    public String nomeProfessor;
    public int id;
    public Disciplina disciplina;
    
    public Professor(String nomeProfessor, int id, Disciplina disciplina) {
        this.nomeProfessor = nomeProfessor;
        this.id = id;
        this.disciplina = disciplina;
    }
}
