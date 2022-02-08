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
public class TesteAssociacao {
    public static void main(String[] args) {
        Disciplina lip2 = new Disciplina("Programacao Orientada a Objetos", 123);
        Disciplina lip1 = new Disciplina("Linguagens I", 321);
        
        Professor mauricio = new Professor("Maurício Moreira", 01, lip2);
        
        lip2.addProfessor(mauricio);
        System.out.println("Nome da Disciplina: " + lip2.getNomeDisciplina());
        System.out.println("Nome do Professor: " + lip2.getNomeProfessor());
    }
}
