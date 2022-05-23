/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactoring;

/**
 *
 * @author maumneto
 */
public class NutricaoTelescopio {
    // atributos obrigatórios!
    private int porcao;
    private int porcaoPorMedida;
    // atributos opcionais
    private int calorias;
    private int gorduras;
    private int sodio;
    private int carboidratos;

    public NutricaoTelescopio(int porcao, int porcaoPorMedida)  {
        this(porcao, porcaoPorMedida, 0);
    }
    
    public NutricaoTelescopio(int porcao, int porcaoPorMedida, int calorias)  {
        this(porcao, porcaoPorMedida, calorias, 0);
    }
    
        public NutricaoTelescopio(int porcao, int porcaoPorMedida, int calorias, int gorduras)  {
        this(porcao, porcaoPorMedida, calorias, gorduras, 0);
    }
    
    public NutricaoTelescopio(int porcao, int porcaoPorMedida, int calorias, int gorduras, int sodio)  {
        this(porcao, porcaoPorMedida, calorias, gorduras, sodio, 0);
    }

    
    public NutricaoTelescopio(int porcao, int porcaoPorMedida, int calorias, int gorduras, int sodio, int carboidratos) {
        this.porcao = porcao;
        this.porcaoPorMedida = porcaoPorMedida;
        this.calorias = calorias;
        this.gorduras = gorduras;
        this.sodio = sodio;
        this.carboidratos = carboidratos;
        
    }
}
