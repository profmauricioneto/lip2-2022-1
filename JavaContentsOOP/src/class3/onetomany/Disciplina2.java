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
public class Disciplina2 {
    public String nomeDisciplina;
    public int codigo;
    public Professor2 professor;
    public Disciplina2(String nomeDisciplina, int codigo, Professor2 professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.professor = professor;
    }
    
    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }
    
    public int getCodigoDisciplina() {
        return this.codigo;
    } 
}
