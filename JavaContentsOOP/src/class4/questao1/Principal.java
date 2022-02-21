/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao1;

/**
 *
 * @author mauricio.moreira
 */
public class Principal {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Mauricio", "mauricio@provedor.com", "123456", "00112233");
        pf.getNome();
        pf.informarDados();
        PessoaJuridica pj = new PessoaJuridica("maumneto", "maumneto@provedor.com", "00-11-11111", "09922");
        pj.getNome();
        pj.informarDados();
        PessoaFisica pf2 = new PessoaFisica();
        pf2.informarDados();
        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.informarDados();
    }
}
