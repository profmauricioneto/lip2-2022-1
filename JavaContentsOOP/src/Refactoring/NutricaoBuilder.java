/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactoring;

/**
 *
 * @author maumneto
 */
public class NutricaoBuilder {
    // atributos obrigatórios!
    private final int porcao;
    private final int porcaoPorMedida;
    // atributos opcionais
    private final int calorias;
    private final int gorduras;
    private final int sodio;
    private final int carboidratos;
    
    public static class Builder {
        // atributos obrigatórios!
        private final int porcao;
        private final int porcaoPorMedida;
        // atributos opcionais
        private int calorias = 0;
        private int gorduras = 0;
        private int sodio = 0;
        private int carboidratos = 0;
        
        public Builder(int porcao, int porcaoPorMedida) {
            this.porcao = porcao;
            this.porcaoPorMedida = porcaoPorMedida;
        }
        
        public Builder calorias(int val) {
            calorias = val;
            return this;
        }
        public Builder gorduras(int val) {
            gorduras = val;
            return this;
        }
        public Builder sodio(int val) {
            sodio = val;
            return this;
        }
        public Builder carboidratos(int val) {
            carboidratos = val;
            return this;
        }
        public NutricaoBuilder build() {
            return new NutricaoBuilder(this);
        }
    }

    private NutricaoBuilder(Builder builder) {
        porcao = builder.porcao;
        porcaoPorMedida = builder.porcaoPorMedida;
        calorias = builder.calorias;
        gorduras = builder.gorduras;
        sodio = builder.sodio;
        carboidratos = builder.carboidratos;
    }
}

