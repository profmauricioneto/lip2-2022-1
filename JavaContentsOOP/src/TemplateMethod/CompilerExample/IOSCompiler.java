/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.CompilerExample;

/**
 *
 * @author maumneto
 */
public class IOSCompiler extends Compiler {

    public IOSCompiler() {}

    @Override
    public void sourceCode() {
        System.out.println("Getting the source code and analysing");
    }

    @Override
    public void compileToObject() {
        System.out.println("Compiling to SwiftCode");
    }

    @Override
    public void execute() {
        System.out.println("Executing in SwiftCode");
    }
    
}
