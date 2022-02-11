/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3.universidade;

import java.util.List;
import java.util.ArrayList;
        
/**
 *
 * @author mauricio.moreira
 */
public class TesteExemplo {
    public static void main(String[] args) {
        Universidade unichristus = new Universidade("UNICHRISTUS", "Centro Universitário");
        
        Curso si = new Curso("Sistemas de Informação", 123, unichristus);
        Curso direito = new Curso("Direito", 321, unichristus);
        
        Estudante e1 = new Estudante("fulano", "01234", si);
        Estudante e2 = new Estudante("cicrano", "43210", si);
        Estudante e3 = new Estudante("beltrano", "98765", direito);
        Estudante e4 = new Estudante("Alano", "56789", direito);
        
        si.addEstudantes(e1);
        si.addEstudantes(e2);
        direito.addEstudantes(e4);
        direito.addEstudantes(e3);
        
        List<Curso> cursos = new ArrayList<>();
        cursos.add(si);
        cursos.add(direito);
        unichristus.addCursos(cursos);
        
        System.out.println("Universidade: " + unichristus.getNomeUniversidade());
        System.out.println("Quantidade de Estudantes: " + unichristus.getTotalEstudantes());
        System.out.println("Quantidade de Cursos: " + unichristus.getTotalCursos());
        System.out.println("Cursos disponíveis: ");
        unichristus.getNomeCursos();
    }         
}
