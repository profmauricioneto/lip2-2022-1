/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactoring;

/**
 *
 * @author maumneto
 */
public class NutritionJavaBeans {
    // atributos obrigatórios!
    private int porcao = -1;
    private int porcaoPorMedida = -1;
    // atributos opcionais
    private int calorias = 0;
    private int gorduras = 0;
    private int sodio = 0;
    private int carboidratos = 0;

    public NutritionJavaBeans() {}
    
    /**
     * @param porcao the porcao to set
     */
    public void setPorcao(int porcao) {
        this.porcao = porcao;
    }

    /**
     * @param porcaoPorMedida the porcaoPorMedida to set
     */
    public void setPorcaoPorMedida(int porcaoPorMedida) {
        this.porcaoPorMedida = porcaoPorMedida;
    }

    /**
     * @param calorias the calorias to set
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    /**
     * @param gorduras the gorduras to set
     */
    public void setGorduras(int gorduras) {
        this.gorduras = gorduras;
    }

    /**
     * @param sodio the sodio to set
     */
    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    /**
     * @param carboidratos the carboidratos to set
     */
    public void setCarboidratos(int carboidratos) {
        this.carboidratos = carboidratos;
    }

    
    
}
