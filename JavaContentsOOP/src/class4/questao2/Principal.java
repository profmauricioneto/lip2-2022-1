/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao2;

/**
 *
 * @author mauricio.moreira
 */
public class Principal {
    public static void main(String[] args) {
        Departamento ti = new Departamento(01);
        PessoaFisica joao = new PessoaFisica(101);
        joao.setCpf("123456789");
        joao.setNome("Joao");
        
        ti.addPessoa(joao);
        joao.setDepartamento(ti);
        
        joao.imprimirInfo();
    }
}
