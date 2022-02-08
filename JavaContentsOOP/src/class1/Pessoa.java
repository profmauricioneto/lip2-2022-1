/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

import java.util.Calendar;

/**
 *
 * @author mauricio.moreira
 */
public class Pessoa {
    public String nome;
    public int ano_nasc;
    public float altura;
    
    public Pessoa(String nome, int ano_nasc, float altura) {
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.altura = altura;
    }
    
    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + ano_nasc);
        System.out.println("Altura: " + altura);
    }
    
    public int calcularIdade() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR) - this.ano_nasc;
    }
    
}
