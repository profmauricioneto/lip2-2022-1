/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.CompilerExample;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class TestingTemplateMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Compiler compiler;
        System.out.println("Choose the compiler [ios or android]:");
        String comp = input.next();
        
        if(comp.contains("ios")) {
            compiler = new IOSCompiler();
        } else if(comp.contains("android")) {
            compiler = new AndroidCompiler();
        } else {
            System.out.println("No one Choose!");
        }
        input.close();
    }
}
