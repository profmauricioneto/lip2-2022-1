/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod.CompilerExample;

/**
 *
 * @author maumneto
 */
public abstract class Compiler {
    public Compiler() {
        this.sourceCode();
        this.compileToObject();
        this.execute();
    }
    public abstract void sourceCode();
    public abstract void compileToObject();
    public abstract void execute();
}
