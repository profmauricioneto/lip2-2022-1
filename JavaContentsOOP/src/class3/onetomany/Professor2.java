/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3.onetomany;

/**
 *
 * @author mauricio.moreira
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mauricio.moreira
 */
public class Professor2 {
    public String nomeProfessor;
    public int id;
    public List<Disciplina2> disciplinas = new ArrayList<Disciplina2>();;
    
    public Professor2(String nomeProfessor, int id) {
        this.nomeProfessor = nomeProfessor;
        this.id = id;
    }
    
    public String getNomeProfessor() {
        return this.nomeProfessor;
    }
    
    public int getIdProfessor() {
        return this.id;
    }
    
    public void addDisciplina(Disciplina2 disciplina) {
        this.disciplinas.add(disciplina);
    }
    
    public int getTotalDisciplina() {
        int qtdDisciplina  = 0;
        for (Disciplina2 d: disciplinas) {
            qtdDisciplina++;
        }
        return qtdDisciplina;
    }
    
    public void getNomeDisciplinas() {
        for(Disciplina2 d: disciplinas) {
            System.out.println(d.getNomeDisciplina());
        }
    }
    
}
