/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4.questao3;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Loja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeCliente, nomeFuncionario;
        System.out.print("Nome do cliente: ");
        nomeCliente = input.nextLine();
        Cliente cliente = new Cliente(1, nomeCliente);
        input.nextLine();
        System.out.print("Nome do Funcionario: ");
        nomeFuncionario = input.nextLine();
        Funcionario funcionario = new Funcionario(2, nomeFuncionario);
        // realizando a venda
        Venda geladeira = new Venda(01, cliente, funcionario, 2000, "Geladeira");
        cliente.addCompra(geladeira);
        funcionario.addVenda(geladeira);
        // ... continuar os testes das classes.
    }
}
