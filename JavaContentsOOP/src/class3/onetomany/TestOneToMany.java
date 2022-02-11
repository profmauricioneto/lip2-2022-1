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
public class TestOneToMany {
    public static void main(String[] args) {
        Professor2 mauricio = new Professor2("Mauricio", 01);
        
        Disciplina2 lip1 = new Disciplina2("Linguagens 1", 001, mauricio);
        Disciplina2 lip2 = new Disciplina2("Linguagens 2", 002, mauricio);
        
        mauricio.addDisciplina(lip1);
        mauricio.addDisciplina(lip2);
        
        System.out.println("Professor: " + mauricio.getNomeProfessor());
        System.out.println("Quantidade de Disciplinas: " + mauricio.getTotalDisciplina());
        System.out.println("Nome das Disciplinas");
        mauricio.getNomeDisciplinas();
    }
}
