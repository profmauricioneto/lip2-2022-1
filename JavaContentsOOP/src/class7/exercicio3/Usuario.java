/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class7.exercicio3;

/**
 *
 * @author maumneto
 */
public class Usuario {
    private String name;
    private long keyNumber;
    private static int id = 0;

    public Usuario(String name) {
        this.name = name;
        incrementId();
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the keyNumber
     */
    public long getKeyNumber() {
        return keyNumber;
    }

    /**
     * @param keyNumber the keyNumber to set
     */
    public void setKeyNumber(long keyNumber) {
        this.keyNumber = keyNumber;
    }

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }
    
    public static void incrementId() {
        id++;
    }
}
